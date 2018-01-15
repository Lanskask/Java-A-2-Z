package ru.smurtazin.concur.other;

import java.util.concurrent.Callable;

public class MyCallable {

    public static void main(String[] args) {
        MyCallable main = new MyCallable();
        main.run();
    }

    void run () {
        Callable<Integer> call = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5;
            }
        };
        (new Thread(call)).start();
    }
}
