package binary.search.tree;

import static java.lang.System.out;

import java.util.Scanner;

public class BinarySearchTreeUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BinarySearchTreeImpl binaryTree = new BinarySearchTreeImpl();
		out.println("Binary Tree Test\n");
		char ch;

		do {
			out.println("\nEnter one Binary Tree Operations\n");
			out.println("1. insert ");
			out.println("2. inorder");
			out.println("3. Delete node");
//			out.println("4. BFS view of BST");
//			out.println("5. DFS view of BST");
			out.println("4. Left view of BST");
			out.println("5. Right view of BST");
			out.println("6. Height of BST");
			out.println("7. Diameter of BST");

			int i = sc.nextInt();

			switch (i) {
			case 1:
				out.println("Enter integer element to insert");
				binaryTree.insert(sc.nextInt());
				break;

			case 2:
				out.println("Inorder traversal of tree.");
				createTree(binaryTree);
				binaryTree.inorderTraversal();
				break;

			case 3:
				out.println("Enter node to delete");
				binaryTree.deleteNode(sc.nextInt());
				break;

			case 4:
				out.println("Left view of BST is :");
				createTree(binaryTree);
				binaryTree.leftView();
				break;

			case 5:
				out.println("Right view of BST is :");
				createTree(binaryTree);

				binaryTree.rightView();
				break;

			case 6:
				out.println("Height of BST is :");
				createTree(binaryTree);

				binaryTree.treeHeight();
				break;
				
			case 7:
				createTree2(binaryTree);
				
				out.println("Diameter of BST is :");
				binaryTree.maxDiameter();
				
				//out.println("Optimised Diameter of BST is :");
				//binaryTree.maxDiameterOptimized();
				break;

			default:
				break;
			}

			out.println("\n\nDo you want to continue (Type y or n) \n");
			ch = sc.next().charAt(0);
		} while (1 == 1);
		// } while (ch == 'Y' || ch == 'y');

	}

	public static void createTree(BinarySearchTreeImpl binaryTree) {
		binaryTree.rootNode = new BinarySearchTreeNode(50);
		
		binaryTree.rootNode.leftNode = new BinarySearchTreeNode(30);
		binaryTree.rootNode.leftNode.leftNode = new BinarySearchTreeNode(10);
		binaryTree.rootNode.leftNode.rightNode = new BinarySearchTreeNode(35);
		binaryTree.rootNode.leftNode.rightNode.rightNode = new BinarySearchTreeNode(45);
		binaryTree.rootNode.leftNode.rightNode.rightNode.leftNode = new BinarySearchTreeNode(40);
		binaryTree.rootNode.leftNode.rightNode.rightNode.leftNode.rightNode = new BinarySearchTreeNode(41);
		
		binaryTree.rootNode.rightNode = new BinarySearchTreeNode(70);
		binaryTree.rootNode.rightNode.leftNode = new BinarySearchTreeNode(65);
		binaryTree.rootNode.rightNode.rightNode = new BinarySearchTreeNode(80);
		binaryTree.rootNode.rightNode.rightNode.rightNode = new BinarySearchTreeNode(90);
		binaryTree.rootNode.rightNode.rightNode.rightNode.rightNode = new BinarySearchTreeNode(100);
	}
	
	public static void createTree2(BinarySearchTreeImpl binaryTree) {
		binaryTree.rootNode = new BinarySearchTreeNode(100);
		
		binaryTree.rootNode.leftNode = new BinarySearchTreeNode(50);
		binaryTree.rootNode.leftNode.leftNode = new BinarySearchTreeNode(30);
		binaryTree.rootNode.leftNode.leftNode.leftNode = new BinarySearchTreeNode(20);

		binaryTree.rootNode.leftNode.leftNode.rightNode = new BinarySearchTreeNode(35);
		binaryTree.rootNode.leftNode.leftNode.rightNode.rightNode = new BinarySearchTreeNode(45);
		
		binaryTree.rootNode.leftNode.rightNode = new BinarySearchTreeNode(70);
		binaryTree.rootNode.leftNode.rightNode.rightNode = new BinarySearchTreeNode(80);
		binaryTree.rootNode.leftNode.rightNode.rightNode.rightNode = new BinarySearchTreeNode(90);
	}
}
