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

	public void printLCA(int n1, int n2){
		BinaryTreeNode n = printLCA(root,n1,n2);
		System.out.println("LCA is :" + n.getData());
	}

	public BinaryTreeNode printLCA(BinaryTreeNode root,int n1,int n2){
		if(root == null)
			return null;

		if(root.data == n1 || root.data == n2)
			return root;

		BinaryTreeNode leftSubtree = printLCA(root.left,n1,n2);
		BinaryTreeNode rightSubtree = printLCA(root.right,n1,n2);

		if(leftSubtree!= null && rightSubtree!=null){
			return root;
		}

		return leftSubtree!= null?leftSubtree:rightSubtree;
	}
	public  void createTree() {

		root = new BinaryTreeNode(50);

		root.left = new BinaryTreeNode(30);
		root.left.left = new BinaryTreeNode(10);
		root.left.right = new BinaryTreeNode(35);
//		root.left.right.right = new BinaryTreeNode(45);
//		root.left.right.right.left = new BinaryTreeNode(40);
//		root.left.right.right.left.right = new BinaryTreeNode(41);

		root.right = new BinaryTreeNode(70);
		root.right.left = new BinaryTreeNode(65);
//		root.right.right = new BinaryTreeNode(80);
//		root.right.right.right = new BinaryTreeNode(90);
//		root.right.right.right.right = new BinaryTreeNode(100);
	}

	public String serializeTree(){
		String str = "";
		return serializeTree(root, str);
	}

	public String serializeTree(BinaryTreeNode root, String str){
		if(root == null)
			return str;

		str = str + " " + root.getData();

		if(null!=root.getLeft()){
			str = serializeTree(root.getLeft(), str);
		}else {
			str = str + " -1 ";
		}

		if(null!=root.getRight()){
			str = serializeTree(root.getRight(), str);
		}else {
			str = str + " -1 ";
		}

		return str;
	}

	static int index;
	public void deserializeTree(String str){
		String[] arr = str.split(",");
		root = deserializeTree(arr);
	}

	public BinaryTreeNode deserializeTree(String[] str){
		if(str[index].equalsIgnoreCase("-1")){
			index++;
			return null;
		}

		BinaryTreeNode node = new BinaryTreeNode(Integer.parseInt(str[index++]));
		node.setLeft(deserializeTree(str));
		node.setRight(deserializeTree(str));

	return node;
	}

}
