package org.david.threads.example;

import org.david.threads.example.thread.NameThread;

public class ExampleExtendThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NameThread("Jhon Weak");
        hilo.start();

        Thread hilo2 =  new NameThread("Maria");
        hilo2.start();

        Thread hilo3 = new NameThread("Pepe");
        hilo3.start();

        System.out.println(hilo.getState());
    }
}
