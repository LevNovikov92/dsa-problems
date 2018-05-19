package strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsPhoneTest {
    @Test
    public void letterCombinations() throws Exception {
        LetterCombinationsPhone test = new LetterCombinationsPhone();
        List<String> result = test.letterCombinations("234");
        for (String str : result) {
            System.out.println(str);
        }
    }

}