package part_02;

import org.junit.Assert;
import org.junit.Test;

public class BalancedParenthesesCheckerTest {
    @Test
    public void testHasBalancedParentheses() {
        String balancedString = "((()))";
        String unbalancedString = "(()()";

        Assert.assertTrue(BalancedParenthesesChecker.hasBalancedParentheses(balancedString));
        Assert.assertFalse(BalancedParenthesesChecker.hasBalancedParentheses(unbalancedString));
    }
}
