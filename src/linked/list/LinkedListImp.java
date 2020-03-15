package linked.list;

public class LinkedListImp {

    LinkedListNode root;
    LinkedListNode root2;

    public LinkedListImp() {
        root = null;
        root2 = null;
    }

    public LinkedListImp(int k) {

        root = new LinkedListNode(10);
        root.nextNode = new LinkedListNode(200);
        root.nextNode.nextNode = new LinkedListNode(30);
        root.nextNode.nextNode.nextNode = new LinkedListNode(4000);
        root.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(50);
        root.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(600);
        root.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(70);
        root.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(8);

        root2 = new LinkedListNode(15);
        root2.nextNode = new LinkedListNode(25);
        root2.nextNode.nextNode = new LinkedListNode(35);
        root2.nextNode.nextNode.nextNode = new LinkedListNode(38);
        root2.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(50);
        root2.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(60);
        root2.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(65);
        root2.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new LinkedListNode(90);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int n) {
        root = addViaWhileLoop(root, n);
    }

    /***
     * Adding through while loop;
     * @param root
     * @param n
     * @return
     */
    public LinkedListNode addViaWhileLoop(LinkedListNode root, int n) {
        if (null == root) {
            return new LinkedListNode(n);
        } else {
            LinkedListNode newNode = new LinkedListNode(n);
            LinkedListNode tempNode = this.root;

            while (null != tempNode.nextNode) {
                tempNode = tempNode.nextNode;
            }

            tempNode.nextNode = newNode;

            return root;
        }
    }

    public LinkedListNode add(LinkedListNode root, int n) {
        if (null == root) {
            return new LinkedListNode(n);
        } else {
            root.nextNode = add(root.getNextNode(), n);
            return root;
        }
    }

    // Parse till the end
    public void parseTillEnd() {
        LinkedListNode tempNode = this.root;
        int k = 1;

        do {
            if (null != tempNode) {
                System.out.println("Element at position " + k + " is " + tempNode.getData());
                tempNode = tempNode.getNextNode();
                k = k + 1;
            } else {
                System.out.println("Give list is empty");
            }
        } while (null != tempNode);
    }

    // Parse to Nth
    public void parseTillNth(int pos) {
        LinkedListNode tempNode = this.root;
        int k = 1;

        while (null != tempNode && k <= pos) {
            System.out.println("Element at position " + k + " is " + tempNode.getData());
            tempNode = tempNode.getNextNode();
            k = k + 1;
        }
    }

    // Add to Nth Position
    public void addToNth(int data, int pos) {
        addToNthPos(root, data, pos);
    }

    private void addToNthPos(LinkedListNode root, int data, int pos) {
        if (null == root) {
            root = new LinkedListNode(data);
        } else {

            LinkedListNode newNode = new LinkedListNode(data);
            LinkedListNode tempNode = this.root;
            int k = 1;

            while (null != tempNode.nextNode && k < pos - 1) {
                tempNode = tempNode.nextNode;
                k = k + 1;
            }

            newNode.nextNode = tempNode.getNextNode();
            tempNode.nextNode = newNode;
        }
    }

    public void reverseTheList() {
        LinkedListNode tempNode = this.root;
        LinkedListNode tempNextNode = null;
        LinkedListNode startNode = null;

        while (null != tempNode) {
            tempNextNode = tempNode.nextNode;
            tempNode.nextNode = startNode;
            startNode = tempNode;
            tempNode = tempNextNode;
        }

        this.root = startNode;
    }

    public void reverseTheListInGroups(int k) {
        LinkedListNode tempNode = this.root;
        LinkedListNode tempNextNode = null;

        LinkedListNode startNode = null;
        LinkedListNode previousGroupEndNode = null;
        LinkedListNode currentGroupEndNode = null;

        LinkedListNode newListStartNode = null;
        boolean newListStartVisited = false;
        int n = 0;

        while (null != tempNode) {
            n++;
            tempNextNode = tempNode.nextNode;
            tempNode.nextNode = startNode;
            startNode = tempNode;

            if (null != tempNextNode) {
                switch (n % k) {
                    case 0:
                        if (!newListStartVisited) {
                            newListStartVisited = true;
                            newListStartNode = tempNode;
                        }
                        if (null != previousGroupEndNode && null != currentGroupEndNode) {
                            previousGroupEndNode.nextNode = startNode;
                            previousGroupEndNode = currentGroupEndNode;
                        }

                        startNode = null;
                        break;

                    case 1:
                        if (null == previousGroupEndNode) {
                            previousGroupEndNode = tempNode;
                        } else {
                            currentGroupEndNode = tempNode;
                        }

                        break;
                }
            } else {
                if (null != previousGroupEndNode && null != currentGroupEndNode) {
                    previousGroupEndNode.nextNode = startNode;
                    previousGroupEndNode = currentGroupEndNode;
                }
            }


            tempNode = tempNextNode;
        }


        this.root = newListStartNode;
    }


    public void parseTillEnd(LinkedListNode node) {
        LinkedListNode tempNode = node;

        do {
            if (null != tempNode) {
                System.out.print(" ---> " + tempNode.getData());
                tempNode = tempNode.getNextNode();
            } else {
                System.out.println("Give list is empty");
            }
        } while (null != tempNode);
    }

    public void mergeTwoLists() {
        System.out.print("elements of First list are: ");
        parseTillEnd(this.root);

        System.out.print("\n elements of Second list are: ");
        parseTillEnd(this.root2);

        this.root = mergeTwoLists(this.root, this.root2);

        System.out.print("\n elements of Merged list are: ");
        parseTillEnd(this.root);
    }

    public LinkedListNode mergeTwoLists(LinkedListNode node1, LinkedListNode node2) {
        LinkedListNode tempNode1 = node1;
        LinkedListNode tempNode2 = node2;

        LinkedListNode tempNextNode = null;

        LinkedListNode newHeadNode = null;
        LinkedListNode tempHeadNode = null;


        while (null != tempNode1 && null != tempNode2) {
            if (tempNode1.data > tempNode2.data) {
                tempNextNode = tempNode2.nextNode;
                tempNode2.nextNode = null;

                if (newHeadNode == null)
                    newHeadNode = tempNode2;
                else
                    tempHeadNode.nextNode = tempNode2;

                tempHeadNode = tempNode2;
                tempNode2 = tempNextNode;

            } else {
                tempNextNode = tempNode1.nextNode;
                tempNode1.nextNode = null;

                if (newHeadNode == null)
                    newHeadNode = tempNode1;
                else
                    tempHeadNode.nextNode = tempNode1;

                tempHeadNode = tempNode1;
                tempNode1 = tempNextNode;
            }
        }

        if (null != tempNode1)
            tempHeadNode.nextNode = tempNode1;
        else if (null != tempNode2)
            tempHeadNode.nextNode = tempNode2;

        return newHeadNode;
    }

    public int getLengthOfList(LinkedListNode node) {
        LinkedListNode tempNode = node;
        int k = 0;

        while (null != tempNode) {
            k++;
            tempNode = tempNode.nextNode;
        }

        return k;
    }

    public LinkedListNode getMiddleNode(LinkedListNode node) {
        LinkedListNode fastNode = node;
        LinkedListNode slowNode = node;

        while (fastNode.nextNode != null && fastNode.nextNode.nextNode != null) {
            fastNode = fastNode.nextNode.nextNode;
            slowNode = slowNode.nextNode;
        }

        return slowNode;
    }

    public LinkedListNode mergeSort(LinkedListNode node) {
        if (node == null || node.nextNode == null)
            return node;

        LinkedListNode middleNode = getMiddleNode(node);
        LinkedListNode middleNextNode = middleNode.nextNode;
        middleNode.nextNode = null;

        LinkedListNode left = mergeSort(node);
        LinkedListNode right = mergeSort(middleNextNode);

        LinkedListNode sortedAndMergedList = mergeTwoLists(left, right);

        return sortedAndMergedList;
    }


    public void mergeSort() {
        System.out.print("Initial list is: ");
        parseTillEnd(this.root);

        this.root = mergeSort(this.root);

        System.out.print("elements of Sorted list is: ");
        parseTillEnd(this.root);
    }
}
