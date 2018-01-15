package ru.smurtazin.concur.atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Market extends Thread {
    private AtomicInteger index;
//    private AtomicLong qindex;
//    private AtomicReferenceFieldUpdater qqindex;
    StringBuffer stringBuffer;
    StringBuilder stringBuilder;

    public Market(AtomicInteger index) {
        this.index = index;
    }

    public AtomicInteger getIndex() {
        return index;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while(true) {
                index.addAndGet(random.nextInt(10));
                Thread.sleep(random.nextInt(500));
                index.addAndGet( - 1 * random.nextInt(10));
                Thread.sleep(random.nextInt(500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
