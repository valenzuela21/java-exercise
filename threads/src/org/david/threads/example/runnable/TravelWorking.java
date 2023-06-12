package org.david.threads.example.runnable;

public class TravelWorking implements Runnable{

    private String name;

    public TravelWorking(String name) {
        this.name =  name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void run() {

        for(int i = 0; i < 10 ; i++){
            System.out.println(i + "=" + name);
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End witch name: " +  name);
    }

}
