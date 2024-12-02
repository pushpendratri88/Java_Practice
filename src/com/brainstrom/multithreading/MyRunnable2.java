package com.brainstrom.multithreading;

public class MyRunnable2 implements Runnable{
    String name;

    public MyRunnable2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
       Account account = Account.getAccountInstance(1L);
        try {
            account.creditAmount(100.00);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
