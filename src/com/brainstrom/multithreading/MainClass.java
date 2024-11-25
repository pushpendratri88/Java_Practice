package com.brainstrom.multithreading;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread =  new MyThread();
        myThread.start();
       for(int i = 0; i< 10;i++) {
           System.out.println("Hello");
           myThread.join();
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               System.out.println(new RuntimeException(e));
           }
       }

    }
}
