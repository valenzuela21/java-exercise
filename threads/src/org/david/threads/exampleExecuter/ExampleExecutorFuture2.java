package org.david.threads.exampleExecuter;

import java.util.concurrent.*;

public class ExampleExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        System.out.println("Size Pool: " +  executor.getPoolSize());
        System.out.println("Count jobs of cola: " +  executor.getQueue().size());

        Callable<String> working = () -> {
            System.out.println("Start working...");

            try {
                System.out.println("Name of thread" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("End Working...");
            return "Result  important of working";
        };

        Callable<Integer> working2 = () -> {
            System.out.println("Start working 2 ...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> result = executor.submit(working);
        Future<String> result2 = executor.submit(working);
        Future<Integer> result3 = executor.submit(working2);

        System.out.println("Size Pool: " +  executor.getPoolSize());
        System.out.println("Count jobs of cola: " +  executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continue execution method main.");

        //System.out.println(result.isDone());
        while (!(result.isDone() && result2.isDone() && result3.isDone())) {
            System.out.println(String.format("result1: %s, - result2: %s, - result3: %s",
                    result.isDone() ? "TERMINATE" : "PROCESS",
                    result2.isDone() ? "TERMINATE" : "PROCESS",
                    result3.isDone() ? "TERMINATE" : "PROCESS"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("Result working 1: " + result.get());
        System.out.println("Final working 1:" + result.isDone());
        System.out.println("Result working 2: " + result2.get());
        System.out.println("Final working 2:" + result2.isDone());
        System.out.println("Result working 3: " + result3.get());
        System.out.println("Final working 3:" + result3.isDone());
    }
}
