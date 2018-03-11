package trees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintBinaryTreeTest {

    private final PrintBinaryTree.TreeNode root = new PrintBinaryTree.TreeNode(0);
    private final PrintBinaryTree.TreeNode node1 = new PrintBinaryTree.TreeNode(0);
    private final PrintBinaryTree.TreeNode node2 = new PrintBinaryTree.TreeNode(0);
    private final PrintBinaryTree.TreeNode node11 = new PrintBinaryTree.TreeNode(0);
    private final PrintBinaryTree.TreeNode node12 = new PrintBinaryTree.TreeNode(0);
    private final PrintBinaryTree.TreeNode node22 = new PrintBinaryTree.TreeNode(0);

    @Before
    public void setUp() {
        root.left = node1;
        root.right = node2;
        node1.left = node11;
        node1.right = node12;
        node2.right = node22;
    }

    @Test
    public void printTree() throws Exception {
        root.val = 1;
        node1.val = 2;
        node2.val = 3;
        node11.val = 4;
        node12.val = 5;
        node22.val = 6;

        PrintBinaryTree.printTree(root);
    }

}