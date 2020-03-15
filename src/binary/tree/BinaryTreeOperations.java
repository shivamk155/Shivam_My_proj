package binary.tree;

import binary.search.tree.BinarySearchTreeImpl;
import binary.search.tree.BinarySearchTreeNode;

import java.util.Scanner;

public class BinaryTreeOperations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Creating object of BT */
        BinaryTree bt = new BinaryTree();
        /* Perform tree operations */

        System.out.println("Binary Tree Test\n");
        char ch;
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. Find LCA of 2 nodes");
            System.out.println("6. Serialize Binary tree");
            System.out.println("7. De-Serialize Binary tree");
            System.out.println("8. Find difference between 2 nodes");
            System.out.println("9. Right view of a binary tree");
            System.out.println("10. Is Binary Search Tree or Not");


            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    bt.insert(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : " + bt.search(scan.nextInt()));
                    break;
                case 3:
                    System.out.println("Nodes = " + bt.count());
                    break;
                case 4:
                    System.out.println("Empty status = " + bt.isEmpty());
                    break;
                case 5:
                    bt.createTree();
                    System.out.println("Enter Node 1");
                    int i = scan.nextInt();

                    System.out.println("Enter Node 2");
                    int j = scan.nextInt();
                    bt.printLCA(i, j);
                    break;
                case 6:
                    bt.createTree();
                    System.out.println("Serialization of binary tree is: " + bt.serializeTree());
                    break;
                case 7:
                    bt.createTree();
                    //String str = "50,30,10,-1,-1,35,-1,-1,70,65,-1,-1,-1";
                    String str = "1,2,-1,30,-1,-1,4,-1,-1";
                    bt.deserializeTree(str);
                    break;

                case 8:
                    bt.createTree();
                    System.out.println("Enter Node 1");
                    int a = scan.nextInt();

                    System.out.println("Enter Node 2");
                    int b = scan.nextInt();
                    int k = bt.findMinimumDistance(a, b);
                    System.out.println("Minimum distance between 2 given nodes is: " + k);
                    break;

                case 9:
                    bt.createTree();
                    bt.rightViewTree();
                    break;

                case 10:
                    bt.createTree();
                    bt.checkBinaryTree();
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.print("\nIn order : ");
            bt.inorder();


            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
    }


}