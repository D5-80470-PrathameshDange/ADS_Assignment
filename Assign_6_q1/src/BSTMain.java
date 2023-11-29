

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
		

//		bst.preorder();
//		bst.inorder();
//		bst.postorder();
		bst.DFSTraversal();
		bst.BFSTraversal();
		System.out.println();
//		BST.Node n[] =  bst.binarySearchWithParent(14);
//		if(n[0] != null)
//			System.out.print("KEY found data: "+n[0].getData());
//		if(n[1] != null)
//			System.out.println(" parent : " + n[1].getData());
//		else if(n[0]==null) {
//			System.out.println("Key not found ");
//		}
		bst.deleteNode(3);
		bst.preorder();
		System.out.println(" height : " + bst.height());
		
		
		
	}

}
