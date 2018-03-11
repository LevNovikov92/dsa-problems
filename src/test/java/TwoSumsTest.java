import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumsTest {
    @Test
    public void twoSum() throws Exception {
        Assert.assertArrayEquals(new int[]{0, 1}, new TwoSums().twoSum(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{1, 3}, new TwoSums().twoSum(new int[]{11, 2, 15, 7}, 9));
    }

}