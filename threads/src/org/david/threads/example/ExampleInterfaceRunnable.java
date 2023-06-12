package org.david.threads.example;

import org.david.threads.example.runnable.TravelWorking;

public class ExampleInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new TravelWorking("Isla Pascua")).start();
        new Thread(new TravelWorking("Robinso Crusoe")).start();
        new Thread(new TravelWorking("Juan Fernandez")).start();
        new Thread(new TravelWorking("Isla San Andres")).start();
    }
}
