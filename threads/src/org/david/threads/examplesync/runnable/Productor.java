package org.david.threads.examplesync.runnable;

import org.david.threads.examplesync.Bakery;

import java.util.concurrent.ThreadLocalRandom;

public class Productor implements  Runnable {

    private Bakery bakerry;

    public Productor(Bakery bakerry) {
        this.bakerry = bakerry;
    }

    @Override
    public void run() {

        for(int i = 0; i< 10; i++){
            bakerry.hornear("Pan n: " +  i  );
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
