package trees

class MaxDepthOfBinaryTree {

    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun maxDepthOfBinaryTree(node: TreeNode?): Int {
        if (node == null) return 0
        return Math.max(maxDepthOfBinaryTree(node.left), maxDepthOfBinaryTree(node.right)) + 1
    }

}

