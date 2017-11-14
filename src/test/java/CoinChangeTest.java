import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {
    @Test
    public void coinChange() throws Exception {
        Assert.assertEquals(4, CoinChange.coinChange(4, new int[]{1, 2, 3}));
    }

}