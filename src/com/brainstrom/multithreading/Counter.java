package com.brainstrom.multithreading;

import com.brainstrom.interview.SynechronTest;

public class Counter {
    int count=0;

    public void incrementCount(){
        synchronized (this) {
            count++;
        }
    }
    public int getCount(){
        return count;
    }

}
