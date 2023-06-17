package org.david.threads.exampleExecuter;

import org.david.threads.examplesync.Bakery;
import org.david.threads.examplesync.runnable.Client;
import org.david.threads.examplesync.runnable.Productor;

import java.util.concurrent.*;

public class ExampleExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Size Pool: " +  executor.getPoolSize());
        System.out.println("Count jobs of cola: " +  executor.getQueue().size());


        Bakery bakery =  new Bakery();
        Runnable product  =  new Productor(bakery);
        Runnable consumer =  new Client(bakery);
        Future<?> future =  executor.submit(product);
        Future<?> future2 =  executor.submit(consumer);

        System.out.println("Size Pool: " +  executor.getPoolSize());
        System.out.println("Count jobs of cola: " +  executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continue execution method main.");


    }
}
