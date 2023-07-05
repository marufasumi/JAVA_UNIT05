package unit05_Part01;
//STEP_02
//O(n log n) runtime without additional memory (using sorting):

import java.util.Arrays;

public class MissingNumberFinder2 {
    public static int findMissingNumberWithSorting(int[] nums, int maxNum) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNumber = findMissingNumberWithSorting(nums, maxNum);
        System.out.println("Missing number: " + missingNumber);
    }
}

/*
 both solutions utilize sorting to find the missing number,
 but they differ in their structure, loop termination
 condition, and the handling of the case where no missing number is found.

 */