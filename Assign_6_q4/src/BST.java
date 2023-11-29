import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
	public static class Node{
		int data;
		Node right;
		Node left;
		public Node(int d) {
			this.data = d;
			right = null;
			left = null;
		}
		public int getData()
		{
			return data;
		}
	}
	int count;
	Node root;
	public BST() {
		root = null;
	}
	public boolean isEmpty() {
		return root == null;
	}
	public void addNode(int value) {
		Node nn = new Node(value);
		if(isEmpty()) {
			root = nn;
			return;
		}
		else {
			Node trav = root;
			while(true) {
				if(value < trav.data) 
				{
					if(trav.left == null) 
					{
						trav.left = nn;
						count++;
						break;
					}
					else {
						trav = trav.left;
					}
				}
				else {
					if(trav.right == null)
					{
						trav.right = nn;
						count++;
						break;
					}
					else
					{
						trav = trav.right;
					}
				}
			}
		}
	}
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	public void preorder() {
		System.out.print("Preorder : ");
		preorder(root);
		System.out.println();
	}
	public void inorder(Node trav)
	{
		if(trav == null)
			return;
		inorder(trav.left);
		System.out.print(" " + trav.data);
		inorder(trav.right);
	}
	public void inorder() {
		System.out.print("Inorder : ");
		inorder(root);
		System.out.println();
	}
	public void postorder(Node trav)
	{
		if(trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(" " + trav.data);
	}
	public void postorder()
	{
		System.out.print("Postorder : ");
		postorder(root);
		System.out.println();
	}
	public void DFSTraversal()
	{
		Stack<Node> st = new Stack<BST.Node>();
		st.push(root);
		System.out.println("DFS Traversal : ");
		while(! st.isEmpty())
		{
			Node trav = st.pop();
			System.out.print(" " + trav.data);
			if(trav.right != null)
			{
				 st.push(trav.right);
			}
			if(trav.left != null)
			{
				st.push(trav.left);
			}
		}
		System.out.println();
	}
	public void BFSTraversal()
	{
		Queue<Node> q = new LinkedList<BST.Node>();
		q.offer(root);
		System.out.println("BFS Traversal : ");
		while(! q.isEmpty())
		{
			Node temp = q.poll();
			System.out.print(" " + temp.data);
			if(temp.left != null)
			{
				q.offer(temp.left);
			}
			if(temp.right != null)
			{
				q.offer(temp.right);
			}
		}
	}
	public Node binarySearch(int key)
	{
		Node trav = root;
		while(trav != null)
		{
			if(key == trav.data)
				return trav;
			if(key < trav.data)
			{
				trav = trav.left;
			}
			else
			{
				trav = trav.right;
			}
		}
		return null;
	}
	public Node[] binarySearchWithParent(int key)
	{
		Node parent = null;
		Node trav = root;
		while(trav != null)
		{
			if(key == trav.data)
			{
				break;
			}
			parent = trav;
			if(key < trav.data )
			{
				trav = trav.left;
			}
			else
			{
				trav = trav.right;
			}
		}
		if(trav == null)
			parent = null;
		return new Node[]{trav, parent};
	}
	public void deleteNode(int key)
	{
		Node[] arr = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		if(temp == null)
			return;
//		if(temp.left != null && temp.right != null)
//		{
//			Node pred = temp.left;
//			parent = temp;
//			while(pred.right != null)
//			{
//				parent = pred;
//				pred = pred.right;
//			}
//			temp.data = pred.data;
//			temp = pred;
//		}
		if(temp.left != null && temp.right != null)
		{
			Node suc = temp.right;
			parent = temp;
			while(suc.left != null)
			{
				parent = suc;
				suc = suc.left;
			}
			temp.data = suc.data;
			temp = suc;
		}
		if(temp.left == null)
		{
			if(temp == root)
			{
				root = temp.right;
			}
			else if(temp == parent.left)
			{
				parent.left = temp.right;
			}
			else
			{
				parent.right = temp.right;
			}
		}
		else {
			if(temp == root)
			{
				root = temp.left;
			}
			else if(parent.left == temp)
			{
				parent.left = temp.left;
			}
			else if(parent.right == temp)
			{
				parent.right = temp.left;
			}
		}
	}
	public int height(Node trav)
	{
		if(trav == null)
			return -1;
		int hl = height(trav.left);
		
		int hr = height(trav.right);
		int max = Integer.max(hl, hr);
		
		return max+1; 
	}
	public int height()
	{
		return height(root);
	}
	public int depthOfNode(int key)
	{
		int cnt=0;
		Node trav = root;
		while(trav != null)
		{
			if(key == trav.data)
				return cnt;
			if(key < trav.data)
			{
				cnt++;
				trav = trav.left;
			}
			else
			{
				cnt++;
				trav = trav.right;
			}
		}
		return 0;
	}
	
}		































