package linked.list.doubly;

public class DoublyLinkedListNode {
    DoublyLinkedListNode leftNode, rightNode;
    int value;

    public DoublyLinkedListNode(int value) {
        this.value = value;
        leftNode = null;
        rightNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoublyLinkedListNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(DoublyLinkedListNode leftNode) {
        this.leftNode = leftNode;
    }

    public DoublyLinkedListNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(DoublyLinkedListNode rightNode) {
        this.rightNode = rightNode;
    }
}
