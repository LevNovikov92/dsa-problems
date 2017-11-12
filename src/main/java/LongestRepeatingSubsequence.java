
/**
 * Longest Repeating Subsequence
 */
public class LongestRepeatingSubsequence {

    public static void main(String[] args) {

    }

    static int longestSubsequence(String string){
        return getCount(0, string.toCharArray());
    }

    static private int getCount(int i, char[] chars) {
        final char ch = chars[i];
        for (int j = i + 1; j < chars.length; j++) {
            if (ch == chars[j]) {
                return 1 + getCount(j, chars);
            }
        }
        if (i + 1 == chars.length) {
            return 0;
        } else {
            return getCount(i + 1, chars);
        }
    }
}