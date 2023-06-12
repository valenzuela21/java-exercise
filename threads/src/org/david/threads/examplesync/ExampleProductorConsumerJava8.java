package org.david.threads.examplesync;

import org.david.threads.examplesync.runnable.Client;
import org.david.threads.examplesync.runnable.Productor;

import java.util.concurrent.ThreadLocalRandom;

public class ExampleProductorConsumerJava8 {
    public static void main(String[] args) {
        Bakery p =  new Bakery();
        new  Thread(() -> {
            for(int i = 0; i< 10; i++){
                p.hornear("Pan n: " +  i  );
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new  Thread(()->{
            for(int i = 0; i<10; i++){
                p.consumer();
            }
        }).start();
    }
}
