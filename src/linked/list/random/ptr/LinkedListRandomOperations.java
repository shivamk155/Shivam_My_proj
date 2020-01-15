package linked.list.random.ptr;

import static java.lang.System.out;

import java.util.Scanner;

public class LinkedListRandomOperations {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		LinkedListRandomImpl bt = new LinkedListRandomImpl();

		out.println("Linked List Test\n");
		char c = 96;
		int j = 'A';
		out.println(c);
		out.println(j);
		out.println("Linked List Test\n");
		char ch;
		do {
			out.println("\nLinked List Operations\n");
			out.println("1. insert ");
			out.println("2. Print complete list");
			out.println("3. Clone complete list");
			out.println("4. Clone complete list in optimized manner");
			out.println("5. Sort list with 0's, 1's, 2's in optimized manner");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				out.println("Enter integer element to insert");
				bt.push(scan.nextInt());
				break;
			case 2:
				out.println("Completed ");
				bt.parse();
				break;
				
			case 3:
				out.println("Clone complete list ");
				bt.cloneList();
				break;
				
			case 4:
				out.println("Clone complete list in optimized manner ");
				bt.cloneListOptimized();
				break;
				
			case 5:
				out.println("Sort list with 0's, 1's, 2's in optimized manner");
				bt.sort012ListOptimized();
				break;
	
	
				
			default:
				out.println("Wrong Entry \n ");
				break;
			}

			out.println("\n\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);

			// } while (ch == 'Y' || ch == 'y');
		} while (1 == 1);

	}
}
