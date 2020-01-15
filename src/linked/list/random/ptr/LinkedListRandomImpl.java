package linked.list.random.ptr;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

public class LinkedListRandomImpl {

	LinkedListRandomNode head;

	public LinkedListRandomImpl() {
		head = null;
	}

	public void push(int data) {
		head = push(head, data);
	}

	public LinkedListRandomNode push(LinkedListRandomNode head, int data) {
		if (null == head) {
			return new LinkedListRandomNode(data);
		} else {
			LinkedListRandomNode newNode = new LinkedListRandomNode(data);
			LinkedListRandomNode tempNode = this.head;

			while (null != tempNode.next) {
				tempNode = tempNode.next;
			}

			tempNode.next = newNode;

			return head;
		}
	}

	/*
	 * Most important lesson here is on java reference....pass by reference does
	 * not work if we pass reference by = operator e.g. head.next = new
	 * LinkedListRandomNode(111). But it works in case of setter
	 * e.g.head.setNext(new LinkedListRandomNode(111));
	 * 
	 * It is surprising but it is true have tested this below
	 * 
	 * public void push(int data) { if (null == head) { head = new
	 * LinkedListRandomNode(data); return; }
	 * 
	 * push(head, data); }
	 * 
	 * public void push(LinkedListRandomNode head, int data) {
	 * LinkedListRandomNode newNode = new LinkedListRandomNode(data);
	 * LinkedListRandomNode tempNode = this.head;
	 * 
	 * while (null != tempNode.next) { tempNode = tempNode.next; }
	 * 
	 * tempNode.setNext(newNode);
	 * 
	 * }
	 */
	public void parse() {
		if (head == null)
			out.println("List is empty");
		else {
			LinkedListRandomNode tmp = head;
			out.println("List is: ");
			while (tmp != null) {
				out.println(tmp.data);
				tmp = tmp.next;
			}
		}
	}

	// Haven't used random ptr but it is the same way.
	public void cloneList() {

		Map<LinkedListRandomNode, LinkedListRandomNode> map = new HashMap<>();
		LinkedListRandomNode tmp = this.head;
		LinkedListRandomNode newNode;
		LinkedListRandomNode cloneNode;

		while (tmp != null) {
			newNode = new LinkedListRandomNode(tmp.data + 10);
			map.put(tmp, newNode);
			tmp = tmp.next;
		}

		tmp = this.head;

		while (tmp != null) {
			cloneNode = map.get(tmp);
			cloneNode.setNext(map.get(tmp.next));
			cloneNode.setRandomPtr(map.get(tmp.randomPtr));
			tmp = tmp.next;
		}

		this.head = map.get(this.head);
	}

	public void cloneListOptimized() {

		LinkedListRandomNode curr = this.head;
		LinkedListRandomNode newNode;

		while (curr != null) {
			newNode = new LinkedListRandomNode(curr.data + 10);
			newNode.next = curr.next;
			curr.next = newNode;
			curr = curr.next;
		}

		curr = this.head;

		while (curr != null) {
			newNode = curr.next;
			newNode.randomPtr = curr.next.randomPtr;
			curr = newNode.next;
		}

		curr = this.head;
		LinkedListRandomNode copyList = curr.next;
		LinkedListRandomNode newHead = curr.next;

		while (curr != null) {
			curr.next = curr.next.next;

			copyList.next = copyList.next.next;
			curr = curr.next;
			copyList = copyList.next;
		}

		this.head = newHead;

	}

	public void sort012ListOptimized() {

		LinkedListRandomNode curr = this.head;
		LinkedListRandomNode newList = null;
		LinkedListRandomNode newNode = null;

		LinkedListRandomNode oneEnd = null;
		LinkedListRandomNode zeroEnd = null;

		boolean firstStep = false;

		while (curr != null) {
			newNode = new LinkedListRandomNode(curr.data);
			if (curr.data == 0) {
				if (firstStep) {
					newList = newNode;
					zeroEnd = newNode;
				} else {
					//add zero in the head
				}

			} else if (curr.data == 1) {
				if (firstStep) {
					newList = newNode;
					oneEnd = newNode;
				} else {
					newNode.next = zeroEnd.next;
					zeroEnd.next = newNode;
				}

			} else {
				if (firstStep) {
					newList = newNode;
				} else {

				}
			}

			firstStep = true;
			newList = newList.next;
			curr = curr.next;
		}
	}

}
