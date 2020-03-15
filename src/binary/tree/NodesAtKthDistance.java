package binary.tree;

public class NodesAtKthDistance {
    public static void main(String[] args) {
        BinaryTreeNode root = null;
        root = createTree(root);
        int data = 70;
        int k = 3;
        printNodesAtK(root, data, k, -1);
    }

    public static BinaryTreeNode createTree(BinaryTreeNode root) {
        root = new BinaryTreeNode(50);

        root.left = new BinaryTreeNode(30);
        root.left.left = new BinaryTreeNode(10);
        root.left.right = new BinaryTreeNode(35);
        root.left.right.right = new BinaryTreeNode(45);
        root.left.right.right.left = new BinaryTreeNode(40);
        root.left.right.right.left.right = new BinaryTreeNode(41);

        root.right = new BinaryTreeNode(70);
        root.right.left = new BinaryTreeNode(65);
        root.right.right = new BinaryTreeNode(80);
        root.right.right.right = new BinaryTreeNode(90);
        root.right.right.right.right = new BinaryTreeNode(100);

        return root;
    }

    public static int printNodesAtK(BinaryTreeNode root, int data, int k, int level) {

        boolean foundNodeHere = false;
        if (root == null)
            return Integer.MIN_VALUE;

        if (level == 0) {
            System.out.println("Element at Kth distance is:" + root.data);
            return -1;
        } else if (level > 0) {
            foundNodeHere = true;
        }

        if (root.data == data)
            level = k;

        int leftSideValue = printNodesAtK(root.left, data, k, level - 1);
        if (leftSideValue == 0) {
            System.out.println("Element at Kth distance is:" + root.data);
            return -1;
        } else if (leftSideValue > 0) {
            level = leftSideValue;
        }

        int rightSideValue = printNodesAtK(root.right, data, k, level - 1);
        if (rightSideValue == 0) {
            System.out.println("Element at Kth distance is:" + root.data);
            return -1;
        } else if (rightSideValue > 0) {
            level = rightSideValue;
            printNodesAtK(root.left, data, k, level - 1);
        }

        if (foundNodeHere)
            return -1;
        else
            return level - 1;

    }
}
