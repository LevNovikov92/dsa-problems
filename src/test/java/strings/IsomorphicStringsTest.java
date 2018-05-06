package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsomorphicStringsTest {
    @Test
    public void isIsomorphic() throws Exception {
        IsomorphicStrings test = new IsomorphicStrings();
        assertTrue(test.isIsomorphic("egg", "add"));
        assertFalse(test.isIsomorphic("foo", "bar"));
        assertFalse(test.isIsomorphic("ab", "aa"));
        assertTrue(test.isIsomorphic("paper", "title"));
    }

}