package binary.search.tree;

public class BinarySearchTreeNode {

	private int data;
	public BinarySearchTreeNode leftNode, rightNode;

	public BinarySearchTreeNode(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinarySearchTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinarySearchTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinarySearchTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinarySearchTreeNode rightNode) {
		this.rightNode = rightNode;
	}
}
