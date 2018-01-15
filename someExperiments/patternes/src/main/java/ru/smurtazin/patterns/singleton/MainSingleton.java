package ru.smurtazin.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class MainSingleton {
    int NUM_OF_THREADS = 7;
    List<Thread> threadList = new ArrayList<>(NUM_OF_THREADS);

    public static void main(String[] args) {
        MainSingleton main = new MainSingleton();
        main.run();
    }

    void run() {
        for (int i = 0; i < NUM_OF_THREADS; i++) {
            this.threadList.add(
                new Thread(
                    new MyThreadBuilder(String.valueOf(i))));
        }
        for (Thread thr : this.threadList) {
            thr.start();
        }
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    static class MyThreadBuilder implements Runnable {
        String name;

        public MyThreadBuilder(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(name);
            System.out.print(singleton.value + " ");
        }
    }

}
