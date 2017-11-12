import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/common-child/problem
 */
public class CommonChild {

    private static int[][] lcsCache;

    static int commonChild(String s1, String s2){
        initCache(s1, s2);
        return LCS(s1.length() - 1, s2.length() - 1, s1, s2);
    }

    private static void initCache(String s1, String s2) {
        lcsCache = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                lcsCache[i][j] = -1;
            }
        }
    }

    private static int LCS(int i, int j, String s1, String s2) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (lcsCache[i][j] >= 0) {
            return lcsCache[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            lcsCache[i][j] = LCS(i - 1, j - 1, s1, s2) + 1;
        } else {
            final int iLcs = LCS(i - 1, j, s1, s2);
            final int jLcs = LCS(i, j - 1, s1, s2);
            if (iLcs > jLcs) {
                lcsCache[i][j] = iLcs;
            } else {
                lcsCache[i][j] = jLcs;
            }
        }
        return lcsCache[i][j];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
    }
}
