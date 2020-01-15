package binary.tree;

public class BinaryTreeNode {
	
	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	BinaryTreeNode right;
	BinaryTreeNode left;
	int data;
	
	public BinaryTreeNode(){
		 right=null;
		 left=null;
		 data=0;
	 }

public BinaryTreeNode(int n){
	 right=null;
	 left=null;
	 data=n;
 }
 

 
}
