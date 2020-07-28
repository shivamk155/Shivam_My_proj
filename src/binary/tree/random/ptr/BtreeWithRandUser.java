package binary.tree.random.ptr;

public class BtreeWithRandUser {
    public static void main(String[] args) {

        BtreeWithRandImpl tree = new BtreeWithRandImpl();
        tree.createRandomTree1();
        tree.cloneRoot();

        System.out.println("Tree is cloned.");
    }
}
