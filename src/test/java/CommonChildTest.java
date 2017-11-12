import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonChildTest {
    @Test
    public void commonChild() throws Exception {
        Assert.assertEquals(4, CommonChild.commonChild("ABCBDAB", "BDCABA"));
    }

}