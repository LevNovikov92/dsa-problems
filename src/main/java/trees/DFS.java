package trees;

import java.util.Stack;

class DFS {

    TreeNode search(TreeNode root, int data) {
        final Stack<TreeNode> stack = new Stack<>();

        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println("Checking node: " + node.val);
            if (node.val == data) return node;
            if (node.left != null) stack.add(node.left);
            if (node.right != null) stack.add(node.right);
        }
        return null;
    }
}
