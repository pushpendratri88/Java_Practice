package com.brainstrom.leetCode;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = new int[] {1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));

    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalTank += gas[i] - cost[i];
            currentTank += gas[i] - cost[i];

            // If currentTank drops below zero, reset the starting station
            if (currentTank < 0) {
                startingStation = i + 1;
                currentTank = 0;
            }
        }
        return totalTank >= 0 ? startingStation : -1;
    }
}
