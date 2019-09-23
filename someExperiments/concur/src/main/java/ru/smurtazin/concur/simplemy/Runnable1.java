package ru.smurtazin.concur.simplemy;

public class Runnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.err.println(ie);
            }
        }
    }
}
