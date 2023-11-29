
public class SCLLMain {

	public static void main(String[] args) {
		SCLL list = new SCLL();
		list.addFirst(20);
		list.addFirst(10);
		
		list.addLast(30);
		list.addLast(40);
		
		list.deleteFirst();
		list.deleteLast();
		
		list.addLast(50);
		list.display();
	}

}
