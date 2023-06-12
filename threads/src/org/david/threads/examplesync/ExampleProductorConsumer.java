package org.david.threads.examplesync;

import org.david.threads.examplesync.runnable.Client;
import org.david.threads.examplesync.runnable.Productor;

public class ExampleProductorConsumer {
    public static void main(String[] args) {
        Bakery p =  new Bakery();
        new  Thread(new Productor(p)).start();
        new  Thread(new Client(p)).start();
    }
}
