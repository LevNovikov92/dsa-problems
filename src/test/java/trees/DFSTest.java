package trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSTest {

    private DFS test;

    @Before
    public void setUp() {
        test = new DFS();
    }

    @Test
    public void search() throws Exception {
        Assert.assertEquals(5, test.search(getTree(), 5).val);
    }

    private TreeNode getTree() {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        return root;
    }

}