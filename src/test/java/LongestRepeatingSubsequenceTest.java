import org.junit.Assert;
import org.junit.Test;

public class LongestRepeatingSubsequenceTest {
    @Test
    public void longestSubsequence() throws Exception {
        Assert.assertEquals(3, LongestRepeatingSubsequence.longestSubsequence("aabebcdd"));
        Assert.assertEquals(2, LongestRepeatingSubsequence.longestSubsequence("axxxy"));
        Assert.assertEquals(0, LongestRepeatingSubsequence.longestSubsequence("axy"));
        Assert.assertEquals(2, LongestRepeatingSubsequence.longestSubsequence("aabb"));
    }
}