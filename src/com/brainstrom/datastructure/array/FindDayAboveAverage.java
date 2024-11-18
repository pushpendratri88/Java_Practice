package com.brainstrom.datastructure.array;

import java.util.Scanner;

public class FindDayAboveAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many Days Temperature ? ");
        int numOfDays = console.nextInt();
        int[] temperatureArray = new int[numOfDays];
        int sum = 0;
        for(int i = 0 ; i < temperatureArray.length; i++){
            System.out.println("Day " + (i+1) + " temperature");
            int dayTemperature = console.nextInt();
            temperatureArray[i] = dayTemperature;
            sum = sum + dayTemperature;
        }
        double averageTemperature = sum / numOfDays;
        int daysAboveAverage = 0;
        for (int i = 0; i < temperatureArray.length;i++){
            if(temperatureArray[i] > averageTemperature){
                daysAboveAverage++;
            }
        }

        System.out.println();
        System.out.println("Average Temperature " + averageTemperature);
        System.out.println("Temperature above average " + daysAboveAverage);
    }
}
