
public class QueueMain {

	public static void main(String[] args) {
		DCLL q = new DCLL();
//		q.addFirst(10);
//		q.addFirst(9);
//		q.addFirst(8);
//		q.addFirst(7);
//		
//		q.fDisplay();
//		
//		q.deleteLast();
//		q.fDisplay();
//		
//		q.deleteLast();
//		q.fDisplay();
//
//		q.deleteLast();
//		q.fDisplay();
//	
//		q.fDisplay();
		
		q.addLast(10);
		q.addLast(20);
		q.addLast(30);
		q.addLast(40);
		q.fDisplay();
		
		q.deleteFirst();
		q.fDisplay();
		
		q.deleteFirst();
		q.fDisplay();
	}

}
