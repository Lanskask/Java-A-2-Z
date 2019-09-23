package ru.smurtazin.concur.joining;

public class JoinRunner {
    static {
        System.out.println("Старт потока Main");
    }

    public static void main(String[] args) {
        JoinRunner th = new JoinRunner();
        th.run();
    }

    void run () {
        JoinThread t1 = new JoinThread("First");
        JoinThread t2 = new JoinThread("Second");
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().toString());
    }
}
