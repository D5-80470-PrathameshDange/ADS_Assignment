
public class DCLLMain {

	public static void main(String[] args) {
		DCLL l = new DCLL();
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(100);
		l.addFirst(50);
		
		l.addPosition(2, 25);
		l.deletePosition(4);
		
		
		l.fDisplay();

	}

}
