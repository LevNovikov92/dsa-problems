package trees

import org.junit.Test

import org.junit.Assert.*

class MaxDepthOfBinaryTreeKtTest {
    @Test
    fun maxDepthOfBinaryTree() {
        val root = MaxDepthOfBinaryTree.Node(1)
        val node1 = MaxDepthOfBinaryTree.Node(1)
        val node2 = MaxDepthOfBinaryTree.Node(1)
        val node3 = MaxDepthOfBinaryTree.Node(1)
        val node4 = MaxDepthOfBinaryTree.Node(1)

        root.left = node1
        node1.left = node2
        node1.right = node4
        root.right = node3

        MaxDepthOfBinaryTree().run {
            assertEquals(3, maxDepthOfBinaryTree(root))
        }
    }

}