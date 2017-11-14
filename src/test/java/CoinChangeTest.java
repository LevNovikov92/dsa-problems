import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {
    @Test
    public void coinChange() throws Exception {
        Assert.assertEquals(4, CoinChange.coinChange(4, new int[]{1, 2, 3}));
        Assert.assertEquals(5, CoinChange.coinChange(10, new int[]{2, 5, 3, 6}));
    }

}