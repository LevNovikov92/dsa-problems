public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        int results = 0;
        for (int i = 0; i < n; i++) {
            results += numTrees(i, 0, n - 1);
        }
        return results;
    }

    private int numTrees(int index, int from, int to) {
        int leftSide = 0;
        for (int j = from; j < index; j++) {
            leftSide += numTrees(j, from, index - 1);
        }

        int rightSide = 0;
        for (int j = index + 1; j < to; j++) {
            rightSide += numTrees(j, index + 1, to);
        }
        return leftSide + rightSide + 1;
    }
}
