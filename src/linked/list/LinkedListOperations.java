package linked.list;

import java.util.Scanner;

public class LinkedListOperations {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		LinkedListImp bt = new LinkedListImp();
		/* Perform tree operations */

		System.out.println("Linked List Test\n");
		char ch;
		do {
			System.out.println("\nLinked List Operations\n");
			System.out.println("1. insert ");
			System.out.println("2. Print complete list");
			System.out.println("3. Print list till Nth position");
			System.out.println("4. Add element at Nth position");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				bt.add(scan.nextInt());
				break;
			case 2:
				System.out.println("Completed ");
				 bt.parseTillEnd();
				break;
			case 3:
				System.out.println("Enter position till you want it to parse");
				bt.parseTillNth(scan.nextInt());
				break;
			case 4:
				System.out.println("Enter position till you want to place element at");
				int pos=scan.nextInt();
				System.out.println("Enter the value of the node");
				int data=scan.nextInt();
				bt.addToNth(data, pos);
				break;
	
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
            
			System.out.println("\n\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		
		} while (ch == 'Y' || ch == 'y');
	}


}
