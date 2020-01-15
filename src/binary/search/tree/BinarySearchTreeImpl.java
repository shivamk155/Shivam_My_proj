package binary.search.tree;

import static java.lang.System.out;

public class BinarySearchTreeImpl {

	BinarySearchTreeNode rootNode = null;

	int parsedLevel = -1;
	int treeHeight = -1;
	int maxDiameter = 0;

	public void insert(int data) {
		rootNode = insert(this.rootNode, data);
	}

	public BinarySearchTreeNode insert(BinarySearchTreeNode rootNode, int data) {

		if (rootNode == null) {
			return new BinarySearchTreeNode(data);
		}

		if (data < rootNode.getData())
			rootNode.leftNode = insert(rootNode.getLeftNode(), data);

		if (data > rootNode.getData())
			rootNode.rightNode = insert(rootNode.getRightNode(), data);

		return rootNode;
	}

	public void inorderTraversal() {
		inorderTraversal(rootNode);
	}

	public void inorderTraversal(BinarySearchTreeNode rootNode) {

		if (rootNode == null)
			return;

		if (rootNode.getLeftNode() != null)
			inorderTraversal(rootNode.getLeftNode());

		System.out.println(rootNode.getData());

		if (rootNode.getRightNode() != null)
			inorderTraversal(rootNode.getRightNode());
	}

	public void deleteNode(int k) {
		rootNode = deleteNode(rootNode, k);
	}

	public BinarySearchTreeNode deleteNode(BinarySearchTreeNode rootNode, int k) {

		if (rootNode == null)
			return rootNode;

		if (k < rootNode.getData())
			rootNode.leftNode = deleteNode(rootNode.leftNode, k);

		if (k > rootNode.getData())
			rootNode.rightNode = deleteNode(rootNode.rightNode, k);

		// Delete leaf node
		if (k == rootNode.getData() && rootNode.getLeftNode() == null && rootNode.getRightNode() == null)
			return null;

		// Delete node with one child
		if (k == rootNode.getData() && ((rootNode.getLeftNode() != null && rootNode.getRightNode() == null)
				|| (rootNode.getRightNode() != null && rootNode.getLeftNode() == null))) {

			if (rootNode.getLeftNode() != null) {
				return rootNode.getLeftNode();
			} else {
				return rootNode.getRightNode();
			}
		}

		// Delete node with 2 child and replace it with in-order predecessor
		if (k == rootNode.getData() && (rootNode.getLeftNode() != null && rootNode.getRightNode() != null)) {
			int mv = maxValue(rootNode.getLeftNode());
			rootNode.setData(mv);

			rootNode.leftNode = deleteNode(rootNode.leftNode, mv);
		}

		return rootNode;
	}

	public int maxValue(BinarySearchTreeNode rootNode) {

		if (rootNode.rightNode != null)
			return maxValue(rootNode.rightNode);
		else
			return rootNode.getData();
	}

	public void rightView() {
		rightView(rootNode, 0);

		// For re initialization for next run
		parsedLevel = -1;
	}

	public void rightView(BinarySearchTreeNode rootNode, int currLevel) {

		if (rootNode == null)
			return;

		if (parsedLevel < currLevel) {
			out.println(rootNode.getData());
			parsedLevel++;
		}

		if (rootNode.rightNode != null)
			rightView(rootNode.rightNode, currLevel + 1);

		if (rootNode.leftNode != null)
			rightView(rootNode.leftNode, currLevel + 1);

	}

	public void leftView() {
		leftView(rootNode, 0);

		// For re initialization for next run
		parsedLevel = -1;
	}

	public void leftView(BinarySearchTreeNode rootNode, int currLevel) {

		if (rootNode == null)
			return;

		if (parsedLevel < currLevel) {
			out.println(rootNode.getData());
			parsedLevel++;
		}

		if (rootNode.leftNode != null)
			leftView(rootNode.leftNode, currLevel + 1);

		if (rootNode.rightNode != null)
			leftView(rootNode.rightNode, currLevel + 1);
	}

	public void treeHeight() {
		if (rootNode != null) {
			treeHeight = 1;
			treeHeight(rootNode, 1);
		}

		out.println(treeHeight);
		treeHeight = -1;
	}

	public void treeHeight(BinarySearchTreeNode rootNode, int currLevel) {

		if (treeHeight < currLevel) {
			treeHeight++;
		}

		if (rootNode.leftNode != null)
			treeHeight(rootNode.leftNode, currLevel + 1);

		if (rootNode.rightNode != null)
			treeHeight(rootNode.rightNode, currLevel + 1);
	}

	// Write a method which return you tree height, not store it in a global
	// variable
	// Then you can write a method to write a function to add left + right + 1;

	public int treeHeight(BinarySearchTreeNode node) {
		if (node != null) {
			treeHeight = 1;
			treeHeight(node, 1);
		}

		int nodeHeight = treeHeight;
		treeHeight = -1;
		return nodeHeight;
	}

	public void maxDiameter() {
		maxDiameter(rootNode);
		out.println(maxDiameter);
	}

	public void maxDiameterOptimized() {
		maxDiameterOptimized(rootNode);
		out.println(maxDiameter);
	}

	public void maxDiameter(BinarySearchTreeNode node) {

		if (node == null)
			return;

		if (node.leftNode != null)
			maxDiameter(node.leftNode);

		if (node.rightNode != null)
			maxDiameter(node.rightNode);

		int totalHeight = (node.leftNode != null ? treeHeight(node.leftNode) : 0) + 1
				+ (node.rightNode != null ? treeHeight(node.rightNode) : 0);

		if (totalHeight > maxDiameter)
			maxDiameter = totalHeight;
	}

	public int maxDiameterOptimized(BinarySearchTreeNode node) {

		if (node == null)
			return 0;

		if (node.leftNode == null && node.rightNode == null)
			return 1;

		int leftHeight = (node.leftNode != null ? maxDiameterOptimized(node.leftNode) : 0);
		int rightHeight = (node.rightNode != null ? maxDiameterOptimized(node.rightNode) : 0);
		int diameterOfCurrNode = leftHeight + 1 + rightHeight;

		if (diameterOfCurrNode > maxDiameter)
			maxDiameter = diameterOfCurrNode;

		if (leftHeight > rightHeight)
			return leftHeight + 1;
		else
			return rightHeight + 1;
	}
}
