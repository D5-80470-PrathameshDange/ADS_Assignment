
public class BSTMain {

	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(13);
		
		
		BST.Node[] arr = bst.getChilds(10);
		BST.Node left = arr[0], right = arr[1];
		if(left == null && right != null)
			System.out.println("right child: "+right.data);
		if(right == null && left != null)
			System.out.println("left child: "+left.data);
		
		if(right != null && left != null)
			System.out.println("left child: "+left.data + " right child: "+right.data);
		

	
		
	}

}
