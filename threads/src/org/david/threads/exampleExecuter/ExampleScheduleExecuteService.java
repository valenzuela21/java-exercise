package org.david.threads.exampleExecuter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExampleScheduleExecuteService {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Working of the main");

        executor.schedule(()->{
            System.out.println("Hello world...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }, 2000, TimeUnit.MILLISECONDS);

        System.out.println("Other Working Job...");
        executor.shutdown();
    }
}
