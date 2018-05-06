package trees

class ValidateBST {

    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isValidBST(root: TreeNode?): Boolean {
        return isValid(root, null, null)
    }

    private fun isValid(root: TreeNode?, min: Int?, max: Int?): Boolean {
        if (root == null) return true
        return (root.left == null || (root.left!!.`val` < root.`val` && if (min != null) root.left!!.`val` > min else true)) &&
                (root.right == null || root.right!!.`val` > root.`val` && if (max != null) root.right!!.`val` < max else true) &&
                isValid(root.left, min, root.`val`) && isValid(root.right, root.`val`, max)
    }
}