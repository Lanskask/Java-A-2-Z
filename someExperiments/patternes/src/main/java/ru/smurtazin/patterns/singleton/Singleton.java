package ru.smurtazin.patterns.singleton;

public class Singleton {

    private static volatile Singleton instance;
    public static String value;

    public Singleton(String value) {
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
}
