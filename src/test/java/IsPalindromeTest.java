import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {
    @Test
    public void isPalindrome() throws Exception {
        final IsPalindrome test = new IsPalindrome();
        Assert.assertTrue(test.isPalindrome(101));
        Assert.assertTrue(test.isPalindrome(0));
        Assert.assertTrue(test.isPalindrome(1221));
        Assert.assertTrue(test.isPalindrome(-1221));
        Assert.assertTrue(test.isPalindrome(12521));
        Assert.assertFalse(test.isPalindrome(125112));
        Assert.assertFalse(test.isPalindrome(1212));
    }

}