package cluster.grpc;

import io.grpc.stub.StreamObserver;
import cluster.grpc.HelloServiceOuterClass.*;
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void helloMethod(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String inputMessage = request.getMessage();
        String outputMessage = "Hello, " + inputMessage + "!";

        HelloResponse response = HelloResponse.newBuilder()
                .setMessage(outputMessage)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void incrementCount(IncrementCounter request, StreamObserver<IncrementCounter> responseObserver) {
        int inputMessage = request.getCounter();
        int outputMessage = inputMessage + 1;

        IncrementCounter response = IncrementCounter.newBuilder()
                .setCounter(outputMessage)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
