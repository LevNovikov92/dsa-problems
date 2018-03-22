import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {

    private StringCompression test;

    @Before
    public void setUp() {
        test = new StringCompression();
    }

    @Test
    public void compressString() throws Exception {
        Assert.assertEquals("a2b1c5a3", test.compressString("aabcccccaaa"));
        Assert.assertEquals("abc", test.compressString("abc"));
    }

}