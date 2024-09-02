package com.brainstrom.leetCode;

import java.util.*;

public class PairWithTargetSum {
    public static void main(String[] args) {
        // Sample list of integers and target sum
        List<Integer> numbers = Arrays.asList(2, 7, 11, 15, 3, 6);
        int targetSum = 9;

        // Find the pair with the target sum
        Optional<int[]> result = findPairWithTargetSum(numbers, targetSum);

        // Print the result
        if (result.isPresent()) {
            int[] pair = result.get();
            System.out.println("Pair found: (" + pair[0] + ", " + pair[1] + ")");
        } else {
            System.out.println("No pair found.");
        }
    }

        public static Optional<int[]> findPairWithTargetSum(List<Integer> numbers, int targetSum) {
            Set<Integer> seenNumbers = new HashSet<>();

            for (int number : numbers) {
                int complement = targetSum - number;

                // Check if the complement is already in the set
                if (seenNumbers.contains(complement)) {
                    // Pair found
                    return Optional.of(new int[]{complement, number});
                }

                // Add the current number to the set
                seenNumbers.add(number);
            }

            // No pair found
            return Optional.empty();
        }
}
