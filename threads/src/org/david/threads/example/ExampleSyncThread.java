package org.david.threads.example;

import org.david.threads.example.runnable.PrintFrases;

public class ExampleSyncThread {

    public static void main(String[] args) throws InterruptedException {
        new  Thread(new PrintFrases("Hola ", "que tal!")).start();
        new  Thread(new PrintFrases("¿Quién eres ", "tú?")).start();
        Thread.sleep(100);
        Thread h3 = new  Thread(new PrintFrases("Muchas ", " gracias amigo!"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());

    }


    public synchronized   static  void printTexts(String txt1, String txt2){
        System.out.print(txt1);
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(txt2);
    }
}
