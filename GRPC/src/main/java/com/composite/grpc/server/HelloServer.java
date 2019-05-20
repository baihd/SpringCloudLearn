package com.composite.grpc.server;

import com.composite.grpc.service.HelloReply;
import com.composite.grpc.service.HelloRequest;
import com.composite.grpc.service.HelloServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * 管理服务器启动/关闭
 */
public class HelloServer {
    private static final Logger logger = Logger.getLogger(HelloServer.class.getName());

    private Server server;

    private void start() throws IOException {
        //服务器运行端口
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new GreeterImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HelloServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * 由于grpc库使用守护线程，因此在主线程上等待终止。
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main方法启动服务器。
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        startServer();
    }

    public static void startServer() throws IOException, InterruptedException {
        final HelloServer server = new HelloServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class GreeterImpl extends HelloServiceGrpc.HelloServiceImplBase {

        @Override
        public void hello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
            HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}