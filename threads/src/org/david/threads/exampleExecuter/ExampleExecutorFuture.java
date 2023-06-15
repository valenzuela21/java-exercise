package org.david.threads.exampleExecuter;

import java.util.concurrent.*;

public class ExampleExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable working = () -> {
            System.out.println("Start working...");

            try {
                System.out.println("Name of thread" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("End Working...");
        };
        Future<?> result = executor.submit(working);
        executor.shutdown();
        System.out.println("Continue execution method main.");

        //System.out.println(result.isDone());
        while(!result.isDone()){
            System.out.println("Execute working...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(result.get(5, TimeUnit.SECONDS));
        System.out.println("Continue...");
        System.out.println(result.isDone());
    }
}
