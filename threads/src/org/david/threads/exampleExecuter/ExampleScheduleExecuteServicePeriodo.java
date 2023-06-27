package org.david.threads.exampleExecuter;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleScheduleExecuteServicePeriodo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Working of the main");

        //CountDownLatch lock = new CountDownLatch(5);

        AtomicInteger contador =  new AtomicInteger(5);
        Future<?> future = executor.scheduleAtFixedRate(()->{
            System.out.println("Hello world...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }, 1000, 2000 ,TimeUnit.MILLISECONDS);
        // lock.await();
        // future.cancel(true);
        // TimeUnit.SECONDS.sleep(10);
        while(contador.get() >= 0){
            if(contador.get() == 0){
                future.cancel(true);
                contador.getAndDecrement();
            }
        }

        System.out.println("Other Working Job...");
        executor.shutdown();
    }
}
