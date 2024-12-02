package com.brainstrom.multithreading;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1 = new MyRunnable1("myRunnable1");
        MyRunnable2 myRunnable2 = new MyRunnable2("myRunnable2");
        Thread myThread1 = new Thread(myRunnable1);
        Thread myThread2 = new Thread(myRunnable2);
        myThread1.start();
        myThread2.start();
    }
}
