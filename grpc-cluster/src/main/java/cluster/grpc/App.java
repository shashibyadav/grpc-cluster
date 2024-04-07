package cluster.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import cluster.grpc.HelloServiceOuterClass.*;
public class App
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        if (args.length >= 2) {
            if (args[0].equals("SERVER")) {
                int serverPort = Integer.parseInt(args[1]);
                Server server = ServerBuilder.forPort(serverPort).addService(new HelloService()).build();
                server.start();
                System.out.println("Server started, listening on " + server.getPort());
                server.awaitTermination();
            } else {
                int serverPort = Integer.parseInt(args[1]);
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", serverPort).usePlaintext().build();
                HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
                IncrementCounter request = IncrementCounter.newBuilder().setCounter(2).build();
                IncrementCounter response = stub.incrementCount(request);  //.getData(request);
                System.out.println("Response received: " + response);
                channel.shutdown();
            }
        } else {
            System.out.println("Pass all command line argument");
        }
    }
}
