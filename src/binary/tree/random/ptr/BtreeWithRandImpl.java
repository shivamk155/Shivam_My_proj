package binary.tree.random.ptr;

import java.util.HashMap;
import java.util.Map;

public class BtreeWithRandImpl {

    BtreeWithRand root;
    BtreeWithRand clonedRoot;

    public void createRandomTree1() {
        root = new BtreeWithRand(10);

        root.left = new BtreeWithRand(20);
        root.right = new BtreeWithRand(30);

        root.left.left = new BtreeWithRand(40);
        root.left.right = new BtreeWithRand(50);
        root.left.right.left = new BtreeWithRand(70);

        root.right.right = new BtreeWithRand(60);
        root.right.right.left = new BtreeWithRand(80);

        root.randNode = root.right.right.left;
        root.right.right.left.randNode = root;

        root.left.randNode = root.left.left;
        root.right.right.randNode = root.left.right.left;

        root.right.randNode = root.left.right;
    }

    public void cloneRoot() {
        Map<BtreeWithRand, BtreeWithRand> map = new HashMap<>();

        traverseTreeNodes(this.root);
        System.out.println();

        traverseTree(this.root, map);
        connectClonedTreeNodes(this.root, map);

        this.clonedRoot = map.get(this.root);

        traverseTreeNodes(this.root);
        System.out.println();
        traverseTreeNodes(this.clonedRoot);
    }

    public void connectClonedTreeNodes(BtreeWithRand root, Map<BtreeWithRand, BtreeWithRand> map) {
        if (root == null)
            return;

        BtreeWithRand node = map.get(root);
        node.setLeft(map.get(root.left));
        node.setRight(map.get(root.right));
        node.setRandNode(map.get(root.randNode));

        connectClonedTreeNodes(root.left, map);
        connectClonedTreeNodes(root.right, map);
    }

    public void traverseTree(BtreeWithRand root, Map<BtreeWithRand, BtreeWithRand> map) {
        if (root == null)
            return;

        map.put(root, new BtreeWithRand(root.key));

        traverseTree(root.left, map);
        traverseTree(root.right, map);
    }

    public void traverseTreeNodes(BtreeWithRand root) {
        if (root == null)
            return;

        traverseTreeNodes(root.left);
        if (root.randNode == null)
            System.out.print("[" + root.key + "," + "NULL" + "]");
        else
            System.out.print("[" + root.key + "," + root.randNode.key + "]");
        traverseTreeNodes(root.right);
    }
}
