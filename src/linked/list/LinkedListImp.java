package linked.list;

public class LinkedListImp {

	LinkedListNode root;

	public LinkedListImp() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void add(int n) {
		root = addViaWhileLoop(root, n);
	}

	/***
	 * Adding through while loop;
	 * @param root
	 * @param n
	 * @return
	 */
	public LinkedListNode addViaWhileLoop(LinkedListNode root, int n) {
		if (null == root) {
			return new LinkedListNode(n);
		} else {
			LinkedListNode newNode = new LinkedListNode(n);
			LinkedListNode tempNode = this.root;

			while (null != tempNode.nextNode) {
				tempNode = tempNode.nextNode;
			}

			tempNode.nextNode = newNode;

			return root;
		}
	}

	public LinkedListNode add(LinkedListNode root, int n) {
		if (null == root) {
			return new LinkedListNode(n);
		} else {
			root.nextNode = add(root.getNextNode(), n);
			return root;
		}
	}

	// Parse till the end
	public void parseTillEnd() {
		LinkedListNode tempNode = this.root;
		int k = 1;

		do {
			if (null != tempNode) {
				System.out.println("Element at position " + k + " is " + tempNode.getData());
				tempNode = tempNode.getNextNode();
				k = k + 1;
			} else {
				System.out.println("Give list is empty");
			}
		} while (null != tempNode);
	}

	// Parse to Nth

	public void parseTillNth(int pos) {
		LinkedListNode tempNode = this.root;
		int k = 1;

		while (null != tempNode && k <= pos) {
			System.out.println("Element at position " + k + " is " + tempNode.getData());
			tempNode = tempNode.getNextNode();
			k = k + 1;
		}
	}

	// Add to Nth Position
	public void addToNth(int data, int pos) {
		addToNthPos(root, data, pos);
	}

	private void addToNthPos(LinkedListNode root, int data, int pos) {
		if (null == root) {
			root = new LinkedListNode(data);
		} else {

			LinkedListNode newNode = new LinkedListNode(data);
			LinkedListNode tempNode = this.root;
			int k = 1;

			while (null != tempNode.nextNode && k < pos - 1) {
				tempNode = tempNode.nextNode;
				k = k + 1;
			}

			newNode.nextNode = tempNode.getNextNode();
			tempNode.nextNode = newNode;
		}
	}

}
