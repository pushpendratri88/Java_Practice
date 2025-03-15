package com.brainstrom.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread myThread = new MyThread(counter);
        MyThread myThread1 = new MyThread(counter);
        ExecutorService executer = Executors.newFixedThreadPool(5);
        Future<String> message = executer.submit(() -> "Hello");
        myThread.start();
        myThread1.start();
        try {
            myThread1.join();
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
