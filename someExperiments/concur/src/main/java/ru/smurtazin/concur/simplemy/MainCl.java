package ru.smurtazin.concur.simplemy;

public class MainCl {

    public static void main(String[] args) {
        MainCl thCl = new MainCl();
        thCl.run();
    }

    void run() {
        Thread1 myThread = new Thread1();
        Thread thread = new Thread(new Runnable1());

        myThread.start();
        thread.start();
    }
}
