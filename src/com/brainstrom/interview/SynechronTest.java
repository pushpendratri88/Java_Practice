package com.brainstrom.interview;

public class SynechronTest {
    public static void main(String[] args) {
        int[] intArray = new int[]{2,1,3};
        int s = 2;
        solution(intArray, s);
      //  System.out.println(solution(intArray, s));
    }

    public static int solution(int[] A, int S) {
        int n = A.length;
        long[] prefixSum = new long[n + 1];

        // Compute prefix sums
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + A[i];
            System.out.println(prefixSum[i]);
        }

        int count = 0;

        // Iterate over all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                long subarraySum = prefixSum[j] - prefixSum[i];
                int subarrayLength = j - i;
                if (subarraySum == (long) S * subarrayLength) {
                    count++;
                    if (count > 1_000_000_000) {
                        return 1_000_000_000;
                    }
                }
            }
        }

        return count;
    }
}