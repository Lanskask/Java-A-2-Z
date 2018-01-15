package ru.smurtazin.concur.simplemy;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.err.println(ie);
            }
        }
    }
}
