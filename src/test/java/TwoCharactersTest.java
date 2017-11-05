import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoCharactersTest {
    @Test
    public void calculate() throws Exception {
        Assert.assertEquals(5, TwoCharacters.calculate("beabeefeab", 10));
    }
}