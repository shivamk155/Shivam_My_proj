package revision.linkedLists;

public class LinkedListUser {

    public static void main(String[] args) {
        LinkedListNode start = null;
        start = createLinkedList(start);

        printLinkedList(start);
        //start = reverseLinkedList(start);
        start = reverseLinkedListInGroups(start, 3);

        System.out.println();
        printLinkedList(start);
    }

    private static LinkedListNode createLinkedList(LinkedListNode start) {

        start = new LinkedListNode(10);
        start.nextNode = new LinkedListNode(20);
        start.nextNode.nextNode = new LinkedListNode(30);

        start.nextNode.nextNode.nextNode = new LinkedListNode(40);
        start.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(50);
        start.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(60);

        start.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(70);
        start.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(80);
        start.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(90);

        start.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(100);
        start.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(110);
        start.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(120);

        return start;
    }

    private static void printLinkedList(LinkedListNode start) {
        LinkedListNode temp = start;

        while (null != temp) {
            System.out.print("  " + temp.data);
            temp = temp.nextNode;
        }
    }

    private static LinkedListNode reverseLinkedList(LinkedListNode start) {

        LinkedListNode temp = start;
        LinkedListNode startTemp = start;
        LinkedListNode tempAhead = start;

        while (null != temp) {
            tempAhead = temp.nextNode;
            temp.nextNode = startTemp;
            startTemp = temp;
            temp = tempAhead;
        }

        start.nextNode = null;
        start = startTemp;

        return start;
    }


    private static LinkedListNode reverseLinkedListInGroups(LinkedListNode start, int groupSize) {
        LinkedListNode temp = start;
        LinkedListNode tempNext = start;

        LinkedListNode newGroupStart = null;
        LinkedListNode oldGroupStart = null;
        LinkedListNode newOrigStart = null;

        int i = 1;
        while (null != temp) {
            tempNext = temp.nextNode;

            if (i % groupSize == 1) {
                if (i == 1) {
                    newGroupStart = temp;
                    oldGroupStart = temp;
                } else {
                    newGroupStart = temp;
                    newOrigStart = temp;
                }
            } else {
                temp.nextNode = newGroupStart;
                newGroupStart = temp;

                if (i % groupSize == 0) {
                    if (i == groupSize) {
                        start = temp;
                    } else {
                        oldGroupStart.nextNode = newGroupStart;
                        oldGroupStart = newOrigStart;
                    }
                }
            }
            i++;
            temp = tempNext;
        }

        if ((i - 1) % groupSize != 0)
            oldGroupStart.nextNode = newGroupStart;

        newOrigStart.nextNode = null;

        return start;
    }
}


