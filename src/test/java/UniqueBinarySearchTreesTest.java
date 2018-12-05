import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueBinarySearchTreesTest {

    @Test
    public void numTrees() {
        UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();

        assertEquals(2, solution.numTrees(2));
        assertEquals(1, solution.numTrees(1));
        assertEquals(5, solution.numTrees(3));
        assertEquals(14, solution.numTrees(4));
        assertEquals(42, solution.numTrees(5));
        assertEquals(429, solution.numTrees(7));
        assertEquals(132, solution.numTrees(6));
    }
}