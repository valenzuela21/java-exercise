package org.david.threads.example;

public class ExampleInterfaceRunnableJava8 {
    static Thread main =  Thread.currentThread();
    public static void main(String[] args) throws InterruptedException {
        Runnable travel = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " = " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("End witch name: " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };


        Thread v1 = new Thread(travel, "Isla Calamar");
        Thread v2 = new Thread(travel, "Cartagena Indias");
        Thread v3 = new Thread(travel, "Isla San Andres");
        Thread v4 = new Thread(travel, "Isla Salamanca");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();

        //Thread.sleep(10000);
        System.out.println("Continue execution method main: " +  main.getName());

    }
}
