package part_04;

import org.junit.Assert;
import org.junit.Test;
import unit05_Part01.MissingNumberFinder;
import unit05_Part01.MissingNumberFinder2;
import unit05_Part01.MissingNumberFinder3;

public class MissingNumberFinderTests {
    @Test
    public void testFindMissingNumberWithHashSet() {
        int[] nums = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int expectedMissingNumber = 8;

        int missingNumber = MissingNumberFinder.findMissingNumberWithHashSet(nums, maxNum);
        Assert.assertEquals(expectedMissingNumber, missingNumber);
    }

    @Test
    public void testFindMissingNumberWithSorting() {
        int[] nums = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int expectedMissingNumber = 8;

        int missingNumber = MissingNumberFinder2.findMissingNumberWithSorting(nums, maxNum);
        Assert.assertEquals(expectedMissingNumber, missingNumber);
    }

    @Test
    public void testFindMissingNumberMathematically() {
        int[] nums = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int expectedMissingNumber = 8;

        int missingNumber = MissingNumberFinder3.findMissingNumberMathematically(nums, maxNum);
        Assert.assertEquals(expectedMissingNumber, missingNumber);
    }
}
