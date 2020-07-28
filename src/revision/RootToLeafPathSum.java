package revision;

public class RootToLeafPathSum {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    boolean hasPathSum(Node node, int sum) {
        if (null == node || sum < 0)
            return false;

        if (node != null && node.left == null && node.right == null && sum - node.data == 0)
            return true;

        if (hasPathSum(node.left, sum - node.data) || hasPathSum(node.right, sum - node.data))
            return true;
        else
            return false;
    }
}