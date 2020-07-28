package revision;

public class BinaryTree {

    int data;
    public BinaryTree leftNode, rightNode;

    BinaryTree(int value) {
        data = value;
        leftNode = null;
        rightNode = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftNode(BinaryTree leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(BinaryTree rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "data=" + data +
                '}';
    }

    BinaryTree() {
        data = 0;
        leftNode = null;
        rightNode = null;
    }
}
