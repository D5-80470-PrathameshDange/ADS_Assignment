
public class BSTree {
	public static class Node{
		int data;
		Node left, right;
		public Node(int d) {
			this.data = d;
			left = right = null;
		}
	}
	Node root;
	public BSTree() {
		root = null;
	}
	public boolean isEmpty() {
		return root == null;
	}
	public void addNode(Node nn) {
		Node trav = root;
		if(isEmpty()) {
			root = nn;
		}
		else if(trav.right == null)
			trav.right = nn;
		else if(trav.left == null)
			trav.left = nn;
		else {
			if(nn.data < trav.data) {
				if(trav.right == null)
					trav.right = nn;
				addNode(trav.left);
			}
			else {
				if(trav.left == null)
					trav.left = nn;
				addNode(nn.right);
			}
		}
		
		
	}
	public void addNode(int data)
	{
		Node nn = new Node(data);
		addNode(nn);
	}
	public void inorder()
	{
		System.out.println("Preorder: ");
		inorder(root);
		System.out.println();
	}
	public void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);
		System.out.print(" " + trav.data);
		inorder(trav.right);
	}
	
}
