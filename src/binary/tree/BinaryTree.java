package binary.tree;

public class BinaryTree {

	private BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(int data) {
		root = insert(root, data);
	}

	public BinaryTreeNode insert(BinaryTreeNode node, int n) {
		if (null == node) {
			node = new BinaryTreeNode(n);
		} else {
			if (null == node.getLeft()) {
				node.left= insert(node.getLeft(), n);
			} else {
				node.right= insert(node.getRight(), n);
			}
		}
		return node;
	}

	public int count() {
		return count(root);
	}

	public int count(BinaryTreeNode node) {
		int l = 0;
		if (null == node) {
		} else {
			l = l + 1;
			if (null != node.getLeft()) {
				l = l + count(node.getLeft());
			}
			if (null != node.getRight()) {
				l = l + count(node.getRight());
			}
		}
		return l;
	}

	public boolean search(int n) {
		return search(root, n);
	}

	public boolean search(BinaryTreeNode node, int n) {
		if (null == node) {
			return false;
		} else {
			if (n == node.getData()) {
				return true;
			}

			boolean temp = search(node.getLeft(), n);
			if (temp)
				return true;

			boolean temp2 = search(node.getRight(), n);
			if (temp2)
				return true;

			return false;
		}
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(BinaryTreeNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

}
