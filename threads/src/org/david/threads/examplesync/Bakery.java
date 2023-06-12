package org.david.threads.examplesync;

public class Bakery {

    private String pan;
    private boolean disponible;

    public  synchronized  void  hornear(String masa){
        while (disponible){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        this.pan =  masa;
        System.out.println("The break pan: " + this.pan);
        this.disponible =  true;
        notify();
    }
    public  synchronized  String consumer() {
        while(!disponible){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Client consume pan: " + this.pan);
        this.disponible = false;
        notify();
        return pan;
    }

}
