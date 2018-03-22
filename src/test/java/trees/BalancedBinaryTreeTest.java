package trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {

    private BalancedBinaryTree test;

    @Before
    public void setUp() {
        test = new BalancedBinaryTree();
    }

    @Test
    public void isBalanced() throws Exception {
        Assert.assertTrue(test.isBalanced(getBalancedTree()));
        Assert.assertFalse(test.isBalanced(getUnbalancedTree()));
    }

    @Test
    public void getHeight() throws Exception {
        Assert.assertEquals(5, test.getHeight(getUnbalancedTree()));
        Assert.assertEquals(3, test.getHeight(getBalancedTree()));
    }

    private TreeNode getUnbalancedTree() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node4.right = node5;
        node5.left = node6;
        return root;
    }

    private TreeNode getBalancedTree() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node1.right = node5;
        node1.left = node6;
        return root;
    }
}