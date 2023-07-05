package unit05_Part01;

//STEP_01

//O(n) runtime with additional memory (using HashSet):

import java.util.HashSet;

public class MissingNumberFinder {
    public static int findMissingNumberWithHashSet(int[] nums, int maxNum) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        for (int i = 1; i <= maxNum; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNumber = findMissingNumberWithHashSet(nums, maxNum);
        System.out.println("Missing number: " + missingNumber);
    }
}

//Similarities
/*
#Both solutions aim to find the missing number from the given array nums and maxNum.
#They both use a loop to iterate from 1 to maxNum and check if each number is present in the set or array.
#The core logic for finding the missing number is the same in both solutions.
 */

//Diffrences
//The provided solution uses Java 8 Stream API to convert the nums array to a Set<Integer>,
// while my solution manually iterates over the nums array and adds elements to a HashSet<Integer>

