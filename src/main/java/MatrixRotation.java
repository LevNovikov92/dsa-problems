public class MatrixRotation {

    void rotateMatrix(int[][] matrix, int n) {
        int layersCount = n / 2;
        for (int i = 0; i < layersCount; i++) {
            int first = i;
            int last = n - i - 1;
            for (int j = first; j < last; j++) {
                int offset = j - first;
                int top = matrix[first][j];
                //left -> top
                matrix[first][j] = matrix[last - offset][first];
                //bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
                //right -> bottom
                matrix[last][last - offset] = matrix[j][last];
                //top -> right
                matrix[j][last] = top;
            }
        }
    }
}
