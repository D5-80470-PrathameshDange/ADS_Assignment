
public class DLLLMain {

	public static void main(String[] args) {
		DLLL l = new DLLL();
		
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.fdisplay();
		
		l.addLast(40);
		l.addLast(50);
		l.fdisplay();
		
		l.deleteFirst();
		l.fdisplay();
		
		l.deleteLast();
		l.fdisplay();
	}

}
