package cluster.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: hello-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cluster.grpc.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cluster.grpc.HelloServiceOuterClass.HelloRequest,
      cluster.grpc.HelloServiceOuterClass.HelloResponse> getHelloMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloMethod",
      requestType = cluster.grpc.HelloServiceOuterClass.HelloRequest.class,
      responseType = cluster.grpc.HelloServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.grpc.HelloServiceOuterClass.HelloRequest,
      cluster.grpc.HelloServiceOuterClass.HelloResponse> getHelloMethodMethod() {
    io.grpc.MethodDescriptor<cluster.grpc.HelloServiceOuterClass.HelloRequest, cluster.grpc.HelloServiceOuterClass.HelloResponse> getHelloMethodMethod;
    if ((getHelloMethodMethod = HelloServiceGrpc.getHelloMethodMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloMethodMethod = HelloServiceGrpc.getHelloMethodMethod) == null) {
          HelloServiceGrpc.getHelloMethodMethod = getHelloMethodMethod =
              io.grpc.MethodDescriptor.<cluster.grpc.HelloServiceOuterClass.HelloRequest, cluster.grpc.HelloServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.grpc.HelloServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.grpc.HelloServiceOuterClass.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloMethod"))
              .build();
        }
      }
    }
    return getHelloMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cluster.grpc.HelloServiceOuterClass.IncrementCounter,
      cluster.grpc.HelloServiceOuterClass.IncrementCounter> getIncrementCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncrementCount",
      requestType = cluster.grpc.HelloServiceOuterClass.IncrementCounter.class,
      responseType = cluster.grpc.HelloServiceOuterClass.IncrementCounter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cluster.grpc.HelloServiceOuterClass.IncrementCounter,
      cluster.grpc.HelloServiceOuterClass.IncrementCounter> getIncrementCountMethod() {
    io.grpc.MethodDescriptor<cluster.grpc.HelloServiceOuterClass.IncrementCounter, cluster.grpc.HelloServiceOuterClass.IncrementCounter> getIncrementCountMethod;
    if ((getIncrementCountMethod = HelloServiceGrpc.getIncrementCountMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getIncrementCountMethod = HelloServiceGrpc.getIncrementCountMethod) == null) {
          HelloServiceGrpc.getIncrementCountMethod = getIncrementCountMethod =
              io.grpc.MethodDescriptor.<cluster.grpc.HelloServiceOuterClass.IncrementCounter, cluster.grpc.HelloServiceOuterClass.IncrementCounter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncrementCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.grpc.HelloServiceOuterClass.IncrementCounter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cluster.grpc.HelloServiceOuterClass.IncrementCounter.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("IncrementCount"))
              .build();
        }
      }
    }
    return getIncrementCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void helloMethod(cluster.grpc.HelloServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<cluster.grpc.HelloServiceOuterClass.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethodMethod(), responseObserver);
    }

    /**
     */
    default void incrementCount(cluster.grpc.HelloServiceOuterClass.IncrementCounter request,
        io.grpc.stub.StreamObserver<cluster.grpc.HelloServiceOuterClass.IncrementCounter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncrementCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloService.
   */
  public static abstract class HelloServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void helloMethod(cluster.grpc.HelloServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<cluster.grpc.HelloServiceOuterClass.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void incrementCount(cluster.grpc.HelloServiceOuterClass.IncrementCounter request,
        io.grpc.stub.StreamObserver<cluster.grpc.HelloServiceOuterClass.IncrementCounter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncrementCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cluster.grpc.HelloServiceOuterClass.HelloResponse helloMethod(cluster.grpc.HelloServiceOuterClass.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethodMethod(), getCallOptions(), request);
    }

    /**
     */
    public cluster.grpc.HelloServiceOuterClass.IncrementCounter incrementCount(cluster.grpc.HelloServiceOuterClass.IncrementCounter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncrementCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloService.
   */
  public static final class HelloServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.grpc.HelloServiceOuterClass.HelloResponse> helloMethod(
        cluster.grpc.HelloServiceOuterClass.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethodMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cluster.grpc.HelloServiceOuterClass.IncrementCounter> incrementCount(
        cluster.grpc.HelloServiceOuterClass.IncrementCounter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncrementCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO_METHOD = 0;
  private static final int METHODID_INCREMENT_COUNT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_METHOD:
          serviceImpl.helloMethod((cluster.grpc.HelloServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<cluster.grpc.HelloServiceOuterClass.HelloResponse>) responseObserver);
          break;
        case METHODID_INCREMENT_COUNT:
          serviceImpl.incrementCount((cluster.grpc.HelloServiceOuterClass.IncrementCounter) request,
              (io.grpc.stub.StreamObserver<cluster.grpc.HelloServiceOuterClass.IncrementCounter>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getHelloMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cluster.grpc.HelloServiceOuterClass.HelloRequest,
              cluster.grpc.HelloServiceOuterClass.HelloResponse>(
                service, METHODID_HELLO_METHOD)))
        .addMethod(
          getIncrementCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cluster.grpc.HelloServiceOuterClass.IncrementCounter,
              cluster.grpc.HelloServiceOuterClass.IncrementCounter>(
                service, METHODID_INCREMENT_COUNT)))
        .build();
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cluster.grpc.HelloServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HelloServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloMethodMethod())
              .addMethod(getIncrementCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
