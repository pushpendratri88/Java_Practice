package com.brainstrom.leetcoderepeat;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = new int[] {1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        System.out.println(canCompleteCycle(gas, cost));
    }

    private static int canCompleteCycle(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startingindex = 0;
        for(int i=0;i < gas.length;i++){
            totalTank = totalTank + gas[i] - cost[i];
            currentTank = currentTank + gas[i] - cost[i];
            if(currentTank < 0){
                currentTank = 0;
                startingindex = i +1;
            }
        }
        return totalTank >= 0 ?startingindex : -1;
    }
}
