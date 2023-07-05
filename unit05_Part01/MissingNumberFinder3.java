package unit05_Part01;
//STEP_03
//O(n) runtime and O(1) runspace with a mathematical approach:

public class MissingNumberFinder3 {
    public static int findMissingNumberMathematically(int[] nums, int maxNum) {
        int expectedSum = (maxNum * (maxNum + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        if (missingNumber >= 1 && missingNumber <= maxNum) {
            return missingNumber;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int missingNumber = findMissingNumberMathematically(nums, maxNum);
        System.out.println("Missing number: " + missingNumber);
    }
}

/*
 both solutions use a mathematical approach to find the missing number by calculating the expected sum
 and subtracting the actual sum. They differ in their structure,
 the handling of the missing number outside the range, and the presence of a class declaration.
 */
