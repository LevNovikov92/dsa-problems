import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixRotationTest {

    private MatrixRotation test;

    @Before
    public void setUp() {
        test = new MatrixRotation();
    }
    @Test
    public void rotateMatrix() throws Exception {
        int[][] matrix = new int[][] {
                new int[] { 1, 2, 3, 4},
                new int[] { 5, 6, 7, 8},
                new int[] { 9,10,11,12},
                new int[] {13,14,15,16}};
        int[][] expected = new int[][] {
                new int[] {13, 9, 5, 1},
                new int[] {14,10, 6, 2},
                new int[] {15,11, 7, 3},
                new int[] {16,12, 8, 4}};

        test.rotateMatrix(matrix, matrix.length);
        Assert.assertArrayEquals(expected, matrix);
    }

}