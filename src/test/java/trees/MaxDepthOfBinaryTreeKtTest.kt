package trees

import org.junit.Test

import org.junit.Assert.*

class MaxDepthOfBinaryTreeKtTest {
    @Test
    fun maxDepthOfBinaryTree() {
        val root = MaxDepthOfBinaryTree.TreeNode(1)
        val node1 = MaxDepthOfBinaryTree.TreeNode(1)
        val node2 = MaxDepthOfBinaryTree.TreeNode(1)
        val node3 = MaxDepthOfBinaryTree.TreeNode(1)
        val node4 = MaxDepthOfBinaryTree.TreeNode(1)

        root.left = node1
        node1.left = node2
        node1.right = node4
        root.right = node3

        MaxDepthOfBinaryTree().run {
            assertEquals(3, maxDepthOfBinaryTree(root))
        }
    }

}