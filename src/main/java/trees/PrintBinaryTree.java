package trees;

import java.util.*;

class PrintBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static class Node extends TreeNode {
        final int height;

        Node(int x, int height) {
            super(x);
            this.height = height;
        }

        Node(TreeNode treeNode, int height) {
            this(treeNode.val, height);
            left = treeNode.left;
            right = treeNode.right;
        }
    }
 
    static List<List<String>> printTree(TreeNode root) {
        final List<List<String>> list = new ArrayList<>();
        final Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(root, 0));
        while (!queue.isEmpty()) {
            final Node node = queue.remove();

            if (list.size() <= node.height) {
                list.add(new ArrayList<>());
            }

            if (node.val < 0) {
                list.get(node.height).add("_");
                continue;
            } else {
                list.get(node.height).add(String.valueOf(node.val));
            }
            if (node.left != null) {
                queue.add(new Node(node.left, node.height + 1));
            } else {
                queue.add(new Node(-1, node.height + 1));
            }
            if (node.right != null) {
                queue.add(new Node(node.right, node.height + 1));
            } else {
                queue.add(new Node(-1, node.height + 1));
            }
        }

        printList(list);

        return list;
    }

    private static void printList(List<List<String>> list) {
        final int size = list.size() - 1;
        for (int i = 0; i < size; i++) {
            final List<String> l = list.get(size - 1 - i);
            for (int j = 0; j < Math.pow(2, i) - 1; j++) {
                System.out.print("_");
            }
            for (int k = 0; k < l.size(); k++) {
                String s = l.get(k);
                System.out.print(s);
                if (k < l.size() - 1) {
                    for (int j = 0; j < Math.pow(2, i + 1) - 1; j++) {
                        System.out.print("_");
                    }
                }
            }
            for (int j = 0; j < Math.pow(2, i) - 1; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
