package linked.list.doubly;

public class DoublyLinkedList {
    DoublyLinkedListNode head;

    public DoublyLinkedList() {
        head = null;
    }

    public DoublyLinkedList(int k) {
        head = new DoublyLinkedListNode(10);
        head.leftNode = null;
        head.rightNode = new DoublyLinkedListNode(20);

        head.rightNode.rightNode = new DoublyLinkedListNode(30);
        head.rightNode.leftNode = head;

        head.rightNode.rightNode.rightNode = new DoublyLinkedListNode(40);
        head.rightNode.rightNode.leftNode = head.rightNode;

        head.rightNode.rightNode.rightNode.rightNode = new DoublyLinkedListNode(50);
        head.rightNode.rightNode.rightNode.leftNode = head.rightNode.rightNode;

        head.rightNode.rightNode.rightNode.rightNode.rightNode = new DoublyLinkedListNode(60);
        head.rightNode.rightNode.rightNode.rightNode.leftNode = head.rightNode.rightNode.rightNode;

        head.rightNode.rightNode.rightNode.rightNode.rightNode.leftNode = head.rightNode.rightNode.rightNode.rightNode;
    }

    public void reverseDoublyLinkedList() {
        DoublyLinkedListNode tempNode = head;
        DoublyLinkedListNode tempNextNode = null;
        DoublyLinkedListNode newHeadNode = null;

        while (tempNode != null) {

            tempNextNode = tempNode.rightNode;

            if (newHeadNode != null)
                newHeadNode.leftNode = tempNode;

            tempNode.rightNode = newHeadNode;
            newHeadNode = tempNode;
            tempNode = tempNextNode;
        }
        newHeadNode.leftNode = null;
        this.head = newHeadNode;
    }

    public void printDoublyLinkedList() {
        DoublyLinkedListNode tempNode = head;

        while (tempNode != null) {
            System.out.print("-->" + tempNode.value);
            tempNode = tempNode.rightNode;
        }
    }
}
