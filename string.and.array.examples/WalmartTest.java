import static java.lang.System.out;

//Spiral traversal of a tree.
public class WalmartTest {

    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    class Tree {
        Node root;

        void printSpiralofTree(Node node) {
            int h = height(node);

            boolean itr = false;
            for (int i = 1; i <= h; i++) {
                printNode(node, i, itr);
                itr = !itr;
            }
        }

        int height(Node node) {
            if (node == null)
                return 0;

            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if (leftHeight > rightHeight)
                return leftHeight + 1;
            else
                return rightHeight + 1;
        }

        void printNode(Node node, int i, boolean itr) {
            if (null == node)
                return;

            if (i == 1)
                out.println(node.data + " ");
            else {
                if (itr) {
                    printNode(node.left, i - 1, itr);
                    printNode(node.right, i - 1, itr);
                } else {
                    printNode(node.right, i - 1, itr);
                    printNode(node.left, i - 1, itr);
                }

            }


        }
    }

    public static void main(String[] args) {

    }


}
