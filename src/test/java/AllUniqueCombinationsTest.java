import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllUniqueCombinationsTest {
    @Test
    public void allCombinations() throws Exception {
        AllUniqueCombinations test = new AllUniqueCombinations();

        List<String> list = test.allCombinations(new int[]{1,2,3,4});
        for (String string : list) {
            System.out.println(string);
        }
    }

}