package strings

import org.junit.Test

import org.junit.Assert.*

class LongestPalindromicSubstringTest {

    @Test
    fun execute() {
        assertEquals(3, LongestPalindromicSubstring().maxLengthOfPalindrome("babad"))
        assertEquals(5, LongestPalindromicSubstring().maxLengthOfPalindrome("bababd"))
        assertEquals(2, LongestPalindromicSubstring().maxLengthOfPalindrome("bb"))
    }

    @Test
    fun longestPalindrome() {
        assertEquals("bab", LongestPalindromicSubstring().longestPalindrome("babad"))
        assertEquals("babab", LongestPalindromicSubstring().longestPalindrome("bababd"))
        assertEquals("bb", LongestPalindromicSubstring().longestPalindrome("bb"))
    }


}