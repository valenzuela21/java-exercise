package org.david.threads.exampletimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ExampleAgendWorkingTimer {
    public static void main(String[] args) {
        Timer timer =  new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Working jobs in: " +  new Date() + "name of thread: " +  Thread.currentThread().getName());
                System.out.println("End time");
                timer.cancel();
            }
        }, 5000);

        System.out.println("Reserve 5 minutes more ...");
    }
}
