public class CuttingRod {

    static int max(int length, int[] prices) {
        if (length <= 0) {
            return 0;
        }

        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (length - i == 0) {
                max = Math.max(max, prices[i]);
            } else if (length - i < 0) {
                //do nothing
            } else {
                max= Math.max(max, prices[i] + max(length - i, prices));
            }
        }
        return max;
    }
}
