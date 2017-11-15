import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuttingRodTest {
    @Test
    public void max() throws Exception {
        Assert.assertEquals(22, CuttingRod.max(8, new int[]{0,1,5,8,9,10,17,17,20}));
        Assert.assertEquals(24, CuttingRod.max(8, new int[]{0,3,5,8,9,10,17,17,20}));
    }

}