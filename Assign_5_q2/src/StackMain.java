
public class StackMain {

	public static void main(String[] args) {
		DCLL stack = new DCLL();
//		stack.addFirst(30);
//		stack.addFirst(20);
//		stack.addFirst(10);
//		stack.fDisplay();
//		
//		stack.deleteFirst();
//		stack.fDisplay();
//
//		stack.deleteFirst();
//		stack.fDisplay();
		
	//	stack.fDisplay();
		stack.addLast(300);
		stack.addFirst(200);
		stack.addFirst(100);
		stack.fDisplay();
		stack.deleteLast();
		stack.fDisplay();
		
		stack.deleteLast();
		stack.fDisplay();
		stack.deleteLast();
		stack.deleteLast();
		stack.fDisplay();
	}

}
