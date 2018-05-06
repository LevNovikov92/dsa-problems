package trees

class ValidateBST {

    class Node(var `val`: Int = 0) {
        var left: Node? = null
        var right: Node? = null
    }

    fun isValidBST(root: Node?): Boolean {
        return isValid(root, null, null)
    }

    private fun isValid(root: Node?, min: Int?, max: Int?): Boolean {
        if (root == null) return true
        return (root.left == null || (root.left!!.`val` < root.`val` && if (min != null) root.left!!.`val` > min else true)) &&
                (root.right == null || root.right!!.`val` > root.`val` && if (max != null) root.right!!.`val` < max else true) &&
                isValid(root.left, min, root.`val`) && isValid(root.right, root.`val`, max)
    }
}