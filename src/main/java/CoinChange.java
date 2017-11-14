import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class CoinChange {

    private static int[] cache;

    static int coinChange(int number, int[] coins) {
        initCache(number);
        Arrays.sort(coins);
        changeCount(number, coins);
        return cache[number];
    }

    private static void initCache(int number) {
        cache = new int[number + 1];
    }

    static int changeCount(int number, int[] coins) {
        if (cache[number] > 0) {
            return cache[number];
        }

        for (int i = coins.length - 1; i >= 0; i--) {
            final int coin = coins[i];
            if (number - coin == 0) {
                cache[number] += 1;
            } else if (number - coin < 0) {
                //do nothing
            } else {
                cache[number] += changeCount(
                        number - coin,
                        Arrays.copyOf(coins, coins.length - 1));
            }
        }
        return cache[number];
    }
}
