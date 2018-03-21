package trees;

import java.util.ArrayList;
import java.util.List;

class TreeTraversal {

    List<Integer> inOrderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        final List<Integer> list = new ArrayList<>();
        traversInOrder(root, list);
        return list;
    }

    List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        final List<Integer> list = new ArrayList<>();
        traversPreOrder(root, list);
        return list;
    }

    private void traversInOrder(TreeNode node, List<Integer> list) {
        if (node.left != null) traversInOrder(node.left, list);
        list.add(node.val);
        if (node.right != null) traversInOrder(node.right, list);
    }

    private void traversPreOrder(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if (node.left != null) traversPreOrder(node.left, list);
        if (node.right != null) traversPreOrder(node.right, list);
    }
}
