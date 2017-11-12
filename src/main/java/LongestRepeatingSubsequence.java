import java.util.Scanner;

/**
 * Longest Repeating Subsequence
 * http://practice.geeksforgeeks.org/problems/longest-repeating-subsequence/0
 */
public class LongestRepeatingSubsequence {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int testCasesCount = sc.nextInt();
        for (int i = 0; i < testCasesCount; i++) {
            sc.nextInt();
            sc.nextLine();
            System.out.println(longestSubsequence(sc.nextLine()));
        }
    }

    private static int[][] lcsCache;

    static int longestSubsequence(String str) {
        initCache(str, str);
        return LRS(str.length() - 1, str.length() - 1, str);
    }

    private static void initCache(String s1, String s2) {
        lcsCache = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                lcsCache[i][j] = -1;
            }
        }
    }

    private static int LRS(int i, int j, String str) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (lcsCache[i][j] >= 0) {
            return lcsCache[i][j];
        }
        if (str.charAt(i) == str.charAt(j) && i != j) {
            lcsCache[i][j] = LRS(i - 1, j - 1, str) + 1;
        } else {
            final int iLcs = LRS(i - 1, j, str);
            final int jLcs = LRS(i, j - 1, str);
            if (iLcs > jLcs) {
                lcsCache[i][j] = iLcs;
            } else {
                lcsCache[i][j] = jLcs;
            }
        }
        return lcsCache[i][j];
    }
}