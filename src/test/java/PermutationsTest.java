import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermutationsTest {
    @Test
    public void permute() throws Exception {
        Permutations test = new Permutations();

        List<List<Integer>> result = test.permute(new int[]{1,2,3});

        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}