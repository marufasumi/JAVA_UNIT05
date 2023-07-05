package part_02;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BalancedBracketsCheckerTest {
    private String input;
    private boolean expected;

    public BalancedBracketsCheckerTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"{[()]()}", true},
                {"{[()()]", false}
        });
    }

    @Test
    public void testHasBalancedBrackets() {
        Assert.assertEquals(expected, BalancedBracketsChecker.hasBalancedBrackets(input));
    }
}
