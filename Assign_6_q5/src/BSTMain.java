
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
		
		
		BST.Node[] arr = bst.binarySearchWithParent(14);
		BST.Node t = arr[0], parent = arr[1];
		
		if(t == null)
		{
			System.out.println("Key not found");
		}
		else if(parent==null)
		{
			System.out.println("Key "+t.getData()+" is root node");
		}
		else {
			System.out.println("Key Found ");
			System.out.println("Key: "+t.getData()+" Parent : "+parent.data);
		}
		
	}

}
