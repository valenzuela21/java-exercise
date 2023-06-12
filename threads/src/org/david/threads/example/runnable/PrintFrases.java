package org.david.threads.example.runnable;

import static org.david.threads.example.ExampleSyncThread.printTexts;

public class PrintFrases implements  Runnable {
    String txt1, txt2;

    public PrintFrases(String txt1, String txt2) {
        this.txt1 = txt1;
        this.txt2 = txt2;
    }

    @Override
    public void run() {
        printTexts(txt1, txt2);
    }
}
