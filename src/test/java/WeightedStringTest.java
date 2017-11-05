import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class WeightedStringTest {
    @Test
    public void getSums() throws Exception {
        final HashMap<Character, Integer> set = WeightedString.getSums("abccddde");
        Assert.assertTrue(WeightedString.contains(set, 1));
        Assert.assertTrue(WeightedString.contains(set, 3));
        Assert.assertTrue(WeightedString.contains(set, 12));
        Assert.assertTrue(WeightedString.contains(set, 5));
        Assert.assertFalse(WeightedString.contains(set, 9));
        Assert.assertFalse(WeightedString.contains(set, 10));
    }

}