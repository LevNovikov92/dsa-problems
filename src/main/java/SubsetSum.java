/**
 * http://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
 */
public class SubsetSum {

    private static Boolean[][] cache;

    static boolean hasSubsetSum(int n, int[] set) {
        initCache(n, set);
        return isSubset(n, 0, set);
    }

    private static void initCache(int n, int[] set) {
        cache = new Boolean[n + 1][set.length];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < set.length; j++) {
                cache[i][j] = null;
            }
        }
    }

    static boolean isSubset(int n, int i, int[] set) {
        if (cache[n][i] != null) {
            return cache[n][i];
        }

        for (int j = i; j < set.length; j++) {
            if (n - set[j] > 0) {
                if (isSubset(n - set[j], i + 1, set)) {
                    cache[n][j] = true;
                    return true;
                }
            } else if (n - set[j] == 0) {
                cache[n][j] = true;
                return true;
            }
        }
        cache[n][i] = false;
        return false;
    }
}
