package strings

class LongestPalindromicSubstring {

    fun maxLengthOfPalindrome(str: String): Int {
        var max = 0
        for (i in 0 until str.length) {
            val substrings = getSubstringsFromIndex(str, i)
            for (s in substrings) {
                if (s == s.reversed() && s.length > max) {
                    max = s.length
                }
            }
        }
        return max
    }

    fun longestPalindrome(str: String): String {
        var longest = ""
        for (i in 0 until str.length) {
            val substrings = getSubstringsFromIndex(str, i)
            for (s in substrings) {
                if (s == s.reversed() && s.length > longest.length) {
                    longest = s
                }
            }
        }
        return longest
    }

    fun getSubstringsFromIndex(str: String, i: Int): List<String> {
        val list = mutableListOf<String>()
        for (j in i until str.length) {
            list.add(str.substring(i, j + 1))
        }
        return list
    }
}