import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SherlockAndValidStringTest {
    @Test
    public void isValid() throws Exception {
        Assert.assertEquals("Yes", SherlockAndValidString.isValid("aabbccc"));
        Assert.assertEquals("Yes", SherlockAndValidString.isValid("cccaabb"));
        Assert.assertEquals("Yes", SherlockAndValidString.isValid("aabbc"));
        Assert.assertEquals("Yes", SherlockAndValidString.isValid("ababc"));
        Assert.assertEquals("No", SherlockAndValidString.isValid("ababcccc"));
        Assert.assertEquals("No", SherlockAndValidString.isValid("ababasdgagacccc"));
    }

}