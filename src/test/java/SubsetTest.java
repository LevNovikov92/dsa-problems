import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubsetTest {

    @Test
    public void subsets() {
        final Subset solution = new Subset();
        final List<List<Integer>> res = solution.subsets(new int[]{1,2,3});

        for (List<Integer> l : res) {
            for (Integer j : l) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}