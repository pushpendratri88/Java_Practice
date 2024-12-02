package com.brainstrom.multithreading;

public class Account {

    static Long accountNo;
    Double accountBalance=100.00;
    private static final Account account = new Account();

    private Account() {

    }

    public Double getAccountBalance(){
        return accountBalance;
    }
    public static Account getAccountInstance(Long accountNo){
        return account;
    }
    public synchronized void creditAmount(Double creditAmount) throws InterruptedException {
        for(int i = 0;i < 10; i++){
            Thread.sleep(500);
            System.out.println("Accessing creditAmount");
            accountBalance = accountBalance + creditAmount;
        }


    }

    public synchronized void  debitAmount(Double debitAmount) throws InterruptedException {
        for(int i = 0;i < 10; i++){
            Thread.sleep(500);
            System.out.println("Accessing debitAmount");
            accountBalance = accountBalance - debitAmount;
        }

    }
}
