package org.david.threads.exampletimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleAgendWorkingTimerPeriodo {
    public static void main(String[] args) {

        AtomicInteger countAtomic = new AtomicInteger(3);
        Timer timer =  new Timer();

        timer.schedule(new TimerTask() {
            //private int count=  3;
            @Override
            public void run() {
                int i = countAtomic.getAndDecrement();
                if(i >  0) {
                    System.out.println("Position " + i + " Working period in: " + new Date() + "name of thread: " + Thread.currentThread().getName());
                }else{
                    System.out.println("End time");
                    timer.cancel();
                }

                //timer.cancel();
            }
        }, 500, 10000);

        System.out.println("Reserve 5 minutes more ...");
    }
}
