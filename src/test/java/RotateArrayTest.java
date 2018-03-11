import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {
    @Test
    public void rotate() throws Exception {
        final RotateArray test = new RotateArray();
        int[] arr = new int [] {1,2,3,4,5,6,7};
        test.rotate(arr, 3);
        Assert.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, arr);

        arr = new int [] {1,2};
        test.rotate(arr, 3);
        Assert.assertArrayEquals(new int[]{2,1}, arr);
    }

    @Test
    public void getShiftedIndex() throws Exception {
        final RotateArray test = new RotateArray();

        Assert.assertEquals(3, test.getShiftedIndex(0, 3, 5));
        Assert.assertEquals(0, test.getShiftedIndex(0, 3, 3));
        Assert.assertEquals(1, test.getShiftedIndex(0, 3, 2));
        Assert.assertEquals(0, test.getShiftedIndex(0, 1, 1));
        Assert.assertEquals(0, test.getShiftedIndex(0, 0, 1));
    }

}