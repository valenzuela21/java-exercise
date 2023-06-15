package org.david.threads.exampleExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable working = () -> {
            System.out.println("Start working...");

            try {
                System.out.println("Name of thread" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("End Working...");
        };
        executor.submit(working);
        executor.shutdown();
        System.out.println("Continue execution method main no. 1");
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Continue execution method main no. 2");
    }
}
