package org.david.threads.examplesync.runnable;

import org.david.threads.examplesync.Bakery;

import java.util.concurrent.ThreadLocalRandom;

public class Client implements  Runnable{

    private Bakery bakery;

    public Client(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            bakery.consumer();
        }
    }
}
