package com.brainstrom.multithreading;

public class MyRunnable1 implements Runnable{
    String name;

    public MyRunnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Account account = Account.getAccountInstance(1L);
        try {
            account.debitAmount(50.00);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
