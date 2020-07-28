package revision;

import java.util.*;

public class BinaryTreeImpl {
    BinaryTree root = null;
    int globalLevel = -1;
    StringBuffer sb = new StringBuffer("");
    int parsed = 1;

    Map<Integer, BinaryTree> nodeMap = new TreeMap<>();

    class QueueObject {
        BinaryTree node;
        int horizontalDistance;

        public QueueObject(int horizontalDistance, BinaryTree node) {
            this.horizontalDistance = horizontalDistance;
            this.node = node;
        }
    }

    Map<Integer, Pair> nodeDepthMap = new TreeMap<>();

    class Pair {
        int nodeData, nodeLevel;

        Pair(int data, int level) {
            nodeData = data;
            nodeLevel = level;
        }
    }

    public void createTree() {
        root = new BinaryTree(10);

        root.leftNode = new BinaryTree(20);
        root.rightNode = new BinaryTree(30);

        root.leftNode.leftNode = new BinaryTree(40);

        root.leftNode.rightNode = new BinaryTree(50);
        root.leftNode.rightNode.rightNode = new BinaryTree(70);
        root.rightNode.rightNode = new BinaryTree(60);

        root.rightNode.rightNode.rightNode = new BinaryTree(80);
        root.rightNode.rightNode.rightNode.rightNode = new BinaryTree(90);
        root.rightNode.rightNode.rightNode.rightNode.leftNode = new BinaryTree(100);

        root.leftNode.rightNode.rightNode.leftNode = new BinaryTree(710);
        root.leftNode.rightNode.rightNode.leftNode.leftNode = new BinaryTree(720);
        root.leftNode.rightNode.rightNode.leftNode.leftNode.leftNode = new BinaryTree(730);
        root.leftNode.rightNode.rightNode.leftNode.leftNode.leftNode.leftNode = new BinaryTree(740);
    }

    public int getHeightOfTree() {
        getHeightOfTree(root, 1);
        return globalLevel;
    }

    public void getHeightOfTree(BinaryTree node, int currLevel) {

        if (null == node)
            return;

        if (currLevel > globalLevel)
            globalLevel++;

        getHeightOfTree(node.leftNode, currLevel + 1);
        getHeightOfTree(node.rightNode, currLevel + 1);
    }

    public int getLCA(int a, int b) {
        return getLCA(root, a, b);
    }

    public int getLCA(BinaryTree node, int a, int b) {
        if (node == null)
            return -1;

        boolean dataFoundAtThisNode = false;
        if (node.data == a || node.data == b)
            dataFoundAtThisNode = true;
        //return node.data;

        int x = getLCA(node.leftNode, a, b);
        int y = getLCA(node.rightNode, a, b);

        if (x > 0 && y > 0)
            return node.data;

        if (x > 0 && dataFoundAtThisNode)
            return node.data;
        else if (x > 0)
            return x;

        if (y > 0 && dataFoundAtThisNode)
            return node.data;
        else if (y > 0)
            return y;

        if (dataFoundAtThisNode)
            return node.data;

        return 0;
    }

    public String NodesAtKthDistance(int value, int KthDistance) {
        NodesAtKthDistance(root, value, KthDistance, -1);
        return sb.toString();
    }

    public int NodesAtKthDistance(BinaryTree node, int value, int KthDistance, int distance) {
        if (node == null)
            return -1;

        if (distance == 0) {
            sb.append(" " + node.data);
            return -1;
        }

        boolean centreNode = false;
        if (node.data == value) {
            distance = KthDistance;
            centreNode = true;
        }

        int x = NodesAtKthDistance(node.leftNode, value, KthDistance, distance - 1);
        int y = NodesAtKthDistance(node.rightNode, value, KthDistance, distance - 1);

        if ((x == 0 || y == 0) && value != node.data) {
            sb.append(" " + node.data);
        }

        if (centreNode)
            return KthDistance - 1;

        if (x > 0)
            return x - 1;
        if (y > 0)
            return y - 1;

        return distance - 1;
    }

    public void spiralTraversalOfTreeWithForLoop() {
        boolean leftRightSwitch = false;

        Stack<BinaryTree> stackRightLeft = new Stack<>();
        Stack<BinaryTree> stackLeftRight = new Stack<>();

        if (null != root) {
            stackRightLeft.add(root);
            leftRightSwitch = true;
        }

        while (!stackRightLeft.isEmpty() || !stackLeftRight.isEmpty()) {
            if (leftRightSwitch) {
                while (!stackRightLeft.isEmpty()) {
                    BinaryTree var = stackRightLeft.pop();
                    if (null != var.leftNode)
                        stackLeftRight.add(var.leftNode);
                    if (null != var.rightNode)
                        stackLeftRight.add(var.rightNode);
                    System.out.print(" " + var.data);
                }
                leftRightSwitch = false;
            } else {
                while (!stackLeftRight.isEmpty()) {
                    BinaryTree var = stackLeftRight.pop();
                    if (null != var.rightNode)
                        stackRightLeft.add(var.rightNode);
                    if (null != var.leftNode)
                        stackRightLeft.add(var.leftNode);
                    System.out.print(" " + var.data);
                }
                leftRightSwitch = true;
            }
        }
    }

    public void printTopViewOfTree() {
        Queue<QueueObject> objQue = new LinkedList<>();

        objQue.add(new QueueObject(0, root));
        while (!objQue.isEmpty()) {
            QueueObject obj = objQue.poll();

            if (null == nodeMap.get(obj.horizontalDistance))
                nodeMap.put(obj.horizontalDistance, obj.node);

            if (null != obj.node.leftNode)
                objQue.add(new QueueObject(obj.horizontalDistance - 1, obj.node.leftNode));

            if (null != obj.node.rightNode)
                objQue.add(new QueueObject(obj.horizontalDistance + 1, obj.node.rightNode));
        }

        for (Integer i : nodeMap.keySet())
            System.out.print(" " + nodeMap.get(i).data);
    }

    public void printTopViewOfTreeRecursive() {
        printTopViewOfTreeRecursive(root, 0, 0);

        for (Integer i : nodeDepthMap.keySet())
            System.out.print(" " + nodeDepthMap.get(i).nodeData);
    }

    private void printTopViewOfTreeRecursive(BinaryTree node, int depth, int level) {
        if (node == null)
            return;

        if (null == nodeDepthMap.get(depth)) {
            nodeDepthMap.put(depth, new Pair(node.data, level));
        } else if (nodeDepthMap.get(depth).nodeLevel > level) {
            nodeDepthMap.put(depth, new Pair(node.data, level));
        }

        printTopViewOfTreeRecursive(node.leftNode, depth - 1, level + 1);
        printTopViewOfTreeRecursive(node.rightNode, depth + 1, level + 1);
    }

    public void printLeftViewOfTreeRecursive() {
        printLeftViewOfTreeRecursive(root, 0);
        System.out.println("left view of tree is: " + sb.toString());
    }

    private void printLeftViewOfTreeRecursive(BinaryTree node, int level) {
        if (null == node)
            return;

        if (level > globalLevel) {
            sb.append(" " + node.data);
            globalLevel = level;
        }
        printLeftViewOfTreeRecursive(node.leftNode, level + 1);
        printLeftViewOfTreeRecursive(node.rightNode, level + 1);
    }

    public String serializeBinaryTree() {
        StringBuffer sb = new StringBuffer("");
        serializeBinaryTree(root, sb);
        System.out.println("Serialized string is: " + sb.toString());
        return sb.toString();
    }

    private void serializeBinaryTree(BinaryTree node, StringBuffer sb) {
        if (null == node)
            return;

        sb.append(" " + node.data);

        if (node.leftNode == null)
            sb.append(" " + -1);
        else
            serializeBinaryTree(node.leftNode, sb);


        if (node.rightNode == null)
            sb.append(" " + -1);
        else
            serializeBinaryTree(node.rightNode, sb);
    }

    public void deSerializeBinaryTree(String str) {
        System.out.println("Starting de-serialisation");
        inorderBinaryTree(root);

        BinaryTree newRoot = null;
        String[] arr = str.split(" ");

        newRoot = deSerializeBinaryTree(newRoot, arr);
        System.out.println();
        inorderBinaryTree(newRoot);
    }

    public BinaryTree deSerializeBinaryTree(BinaryTree node, String[] arr) {
        if (this.parsed == arr.length)
            return null;

        if (arr[this.parsed].equals("-1")) {
            this.parsed++;
            return null;
        }

        node = new BinaryTree(Integer.valueOf(arr[this.parsed]));
        this.parsed++;

        node.leftNode = deSerializeBinaryTree(node.leftNode, arr);
        node.rightNode = deSerializeBinaryTree(node.rightNode, arr);

        return node;
    }

    private void inorderBinaryTree(BinaryTree node) {
        if (null == node)
            return;

        inorderBinaryTree(node.leftNode);
        System.out.print(" " + node.data);
        inorderBinaryTree(node.rightNode);
    }

}
