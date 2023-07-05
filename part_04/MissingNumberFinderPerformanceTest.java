package part_04;

import org.junit.Assert;
import org.junit.Test;
import unit05_Part01.MissingNumberFinder;
import unit05_Part01.MissingNumberFinder2;
import unit05_Part01.MissingNumberFinder3;

public class MissingNumberFinderPerformanceTest {
    private static final int[] LARGE_NUMS = new int[1000000];
    private static final int LARGE_MAX_NUM = 1000000;

    @Test(timeout = 1000)
    public void testFindMissingNumberWithHashSet_Performance() {
        MissingNumberFinder.findMissingNumberWithHashSet(LARGE_NUMS, LARGE_MAX_NUM);
    }

    @Test(timeout = 1000)
    public void testFindMissingNumberWithSorting_Performance() {
        MissingNumberFinder2.findMissingNumberWithSorting(LARGE_NUMS, LARGE_MAX_NUM);
    }

    @Test(timeout = 1000)
    public void testFindMissingNumberMathematically_Performance() {
        MissingNumberFinder3.findMissingNumberMathematically(LARGE_NUMS, LARGE_MAX_NUM);
    }
}
