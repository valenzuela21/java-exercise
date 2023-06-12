package org.david.threads.example.thread;

public class NameThread extends Thread {
    public NameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicio el metodo run hilo " +  getName());
        for(int i = 0; i <10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName());
        }
        System.out.println("Finaliza Thread");
    }
}
