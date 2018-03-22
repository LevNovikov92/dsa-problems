package trees;

import java.util.LinkedList;
import java.util.Queue;

class BFS {

    TreeNode search(TreeNode root, int data) {
        final Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.println("Check " + node.val);
            if (node.val == data) {
                return node;
            }

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return null;
    }
}
