

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
		

		System.out.println("number of leaf nodes : " + bst.countLeafNode());
		
	}

}
