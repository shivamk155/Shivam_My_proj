package linked.list.random.ptr;

public class LinkedListRandomNode {
	int data;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedListRandomNode getNext() {
		return next;
	}

	public void setNext(LinkedListRandomNode next) {
		this.next = next;
	}

	public LinkedListRandomNode getRandomPtr() {
		return randomPtr;
	}

	public void setRandomPtr(LinkedListRandomNode randomPtr) {
		this.randomPtr = randomPtr;
	}

	LinkedListRandomNode next, randomPtr;
	
	public LinkedListRandomNode(int data) {
		this.data = data;
		this.next=null;
		this.randomPtr=null;
	}
}
