package binary.tree.random.ptr;

import java.util.Objects;

public class BtreeWithRand {

    BtreeWithRand left, right, randNode;
    int key;

    public BtreeWithRand getLeft() {
        return left;
    }

    public void setLeft(BtreeWithRand left) {
        this.left = left;
    }

    public BtreeWithRand getRight() {
        return right;
    }

    public void setRight(BtreeWithRand right) {
        this.right = right;
    }

    public BtreeWithRand getRandNode() {
        return randNode;
    }

    public void setRandNode(BtreeWithRand randNode) {
        this.randNode = randNode;
    }

    public int getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BtreeWithRand that = (BtreeWithRand) o;
        return key == that.key &&
                Objects.equals(left, that.left) &&
                Objects.equals(right, that.right) &&
                Objects.equals(randNode, that.randNode);
    }

    @Override
    public int hashCode() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public BtreeWithRand(int value) {
        key = value;
        left = null;
        right = null;
        randNode = null;
    }
}
