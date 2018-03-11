package trees;

class LongestUnivaluePath {

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

    int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        final int maxLeft = root.left != null && root.left.val == root.val ? longestUnivaluePath(root.left) + 1
                : root.left != null ? longestUnivaluePath(root.left) : 0;
        final int maxRight = root.right != null && root.right.val == root.val ? longestUnivaluePath(root.right) + 1
                : root.right != null ? longestUnivaluePath(root.right) : 0;

        return Math.max(maxLeft, maxRight);
    }
}
