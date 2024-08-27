package com.brainstrom.test;

import java.util.Arrays;

public class ArrayExample{
    public static void main(String[] args) {
        String[] strArray  = new String[]{"A","B","C"};
        String[] strArray1  = {"X","Y","Z"};
        int[] intArray =  new int[]{1,2,3};
        int[] intArray1 =  {11,12,13};

        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(strArray1));
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray1));


    }
}
