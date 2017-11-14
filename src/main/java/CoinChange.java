/**
 * http://practice.geeksforgeeks.org/problems/coin-change/0
 */
public class CoinChange {

    static int coinChange(int number, int[] coins) {
        return changeCount(number, coins.length - 1, coins);
    }

    static int changeCount(int number, int i, int[] coins) {
        if (i < 0) {
            return 0;
        }

        final int coin = coins[i];

        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return 0;
        } else {
            return changeCount(number, i - 1, coins) +
                    changeCount(number - coin, i, coins);
        }
    }
}
