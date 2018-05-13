package strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class LongestUnrepeatedSubstringTest {
    @Test
    public void longestSubstring() throws Exception {
        LongestUnrepeatedSubstring test = new LongestUnrepeatedSubstring();
        Assert.assertEquals("wke", test.longestSubstring("pwwkew"));
    }

    @Test
    public void getString() throws Exception {
        LongestUnrepeatedSubstring test = new LongestUnrepeatedSubstring();
        Queue<Character> queue = new LinkedList<>();

        queue.add('a');
        queue.add('b');
        queue.add('c');

        Assert.assertEquals("abc", test.getString(queue));
    }

}