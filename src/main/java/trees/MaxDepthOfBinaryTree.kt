package trees

class MaxDepthOfBinaryTree {

    class Node(var `val`: Int = 0) {
        var left: Node? = null
        var right: Node? = null
    }

    fun maxDepthOfBinaryTree(node: Node?): Int {
        if (node == null) return 0
        return Math.max(maxDepthOfBinaryTree(node.left), maxDepthOfBinaryTree(node.right)) + 1
    }

}

