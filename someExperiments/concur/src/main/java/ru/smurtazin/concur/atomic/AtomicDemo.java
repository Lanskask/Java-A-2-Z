package ru.smurtazin.concur.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static final int NUMB_OF_BROKERS = 10;

    public static void main(String[] args) {
        Market market = new Market(new AtomicInteger(100));
        market.start();
        for (int i = 0; i < NUMB_OF_BROKERS; i++) {
            new Broker(market).start();
        }
    }
}
