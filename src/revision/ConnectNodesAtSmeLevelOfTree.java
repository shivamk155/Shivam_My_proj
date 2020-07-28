package revision;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSmeLevelOfTree {

    static TreeNode root = null;

    private static class TreeNode {
        int data;
        TreeNode next;
        TreeNode left, right;
        int level;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
            next = null;
        }
    }

    private static void createTree() {
        root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right.right = new TreeNode(60);
    }

    public static void main(String[] args) {
        createTree();
        Queue<TreeNode> queue = new LinkedList<>();

        if (null != root) {
            root.level = 1;
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (null != queue.peek() && node.level == queue.peek().level)
                node.next = queue.peek();

            if (null != node.left) {
                node.left.level = node.level + 1;
                queue.add(node.left);
            }

            if (null != node.right) {
                node.right.level = node.level + 1;
                queue.add(node.right);
            }
        }

        System.out.println("Nodes at same level are connected now. You can check these after putting break points here.");
    }

}
