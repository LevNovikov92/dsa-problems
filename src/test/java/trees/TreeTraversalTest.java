package trees;

import org.junit.Assert;
import org.junit.Test;

public class TreeTraversalTest {
    @Test
    public void inOrderTraversal() throws Exception {
        TreeNode node = new TreeNode(1);
        TreeNode node1R = new TreeNode(2);
        TreeNode node2L = new TreeNode(3);
        node.right = node1R;
        node1R.left = node2L;

        TreeTraversal test = new TreeTraversal();

        Assert.assertArrayEquals(new Integer[] {1, 3, 2}, test.inOrderTraversal(node).toArray());
    }

    @Test
    public void preOrderTraversal() throws Exception {
        TreeNode node = new TreeNode(1);
        TreeNode node1R = new TreeNode(2);
        TreeNode node2L = new TreeNode(3);
        node.right = node1R;
        node1R.left = node2L;

        TreeTraversal test = new TreeTraversal();

        Assert.assertArrayEquals(new Integer[] {1, 2, 3}, test.preOrderTraversal(node).toArray());
    }
}