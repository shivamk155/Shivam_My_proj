package revision;

import java.util.Arrays;

public class CallByValueNReference {
    public static void main(String[] args) {
        BinaryTreeImpl tree = new BinaryTreeImpl();
        tree.createTree();

        //Read about arrays and call by reference
        Integer[] arr = {10};
        int[] arr2 = {100};
        System.out.println(Arrays.toString(arr) + " " + Arrays.toString(arr2));
        increementArr(arr, arr2);
        System.out.println(Arrays.toString(arr) + " " + Arrays.toString(arr2));

        Integer brr = new Integer(30);
        int brr2 = 300;

        System.out.println(brr + " " + brr2);
        increementBrr(brr, brr2);
        System.out.println(brr + " " + brr2);

        //Here is the key thing to understand....very very imp
        System.out.println(tree.root.leftNode);
        increementTree(tree.root);
        System.out.println(tree.root.leftNode);

        System.out.println(tree.root.data);
        increementTreeRoot(tree.root);
        System.out.println(tree.root.data);

        //If you try to change anything under the reference pointer then it will be changed including new referrence
        System.out.println(tree.root.data);
        increementTreeRoot2(tree.root);
        System.out.println(tree.root.data);


        System.out.println("\n Thanks...Bbye !!!");

    }

    public static void increementArr(Integer[] arr, int[] arr2) {
        arr[0] = new Integer(20);
        arr2[0] = 200;
    }

    public static void increementBrr(Integer arr, int arr2) {
        arr = new Integer(33);
        arr2 = 330;
    }

    public static void increementTree(BinaryTree node) {
        //node.data = 200000;
        node.leftNode = new BinaryTree(20000);
    }

    public static void increementTreeRoot(BinaryTree node) {
        node = new BinaryTree(20000);
    }

    public static void increementTreeRoot2(BinaryTree node) {
        node.data = 200000;
    }


}
