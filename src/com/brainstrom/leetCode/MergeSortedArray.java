package com.brainstrom.leetCode;
//Input: nums1 = [1],
// m = 3,
// nums2 = [2,5,6],
// n = 3


import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
       merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    nums1 = new int[m+n];
    for(int i = 0; i < nums1.length; i++){
        System.out.println(nums1[i]);
    }

    }
}
