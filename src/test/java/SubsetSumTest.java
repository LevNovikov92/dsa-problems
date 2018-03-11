import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetSumTest {
    @Test
    public void hasSubsetSum() throws Exception {
        Assert.assertTrue(SubsetSum.hasSubsetSum(9, new int[]{3, 34, 4, 12, 5, 23}));
        Assert.assertTrue(SubsetSum.hasSubsetSum(9, new int[]{3, 34, 4, 12, 5, 2}));
        Assert.assertTrue(SubsetSum.hasSubsetSum(9, new int[]{3, 34, 4, 12, 5, 1, 1}));
        Assert.assertTrue(SubsetSum.hasSubsetSum(9, new int[]{3, 34, 4, 12, 1, 1}));
        Assert.assertFalse(SubsetSum.hasSubsetSum(9, new int[]{3, 34, 4, 12, 14}));
        Assert.assertFalse(SubsetSum.hasSubsetSum(9, new int[]{34, 3, 4, 12, 14}));
    }

}