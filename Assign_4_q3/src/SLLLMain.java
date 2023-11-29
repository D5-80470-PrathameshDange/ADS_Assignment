
public class SLLLMain {
	public static void main(String[] args) {
		SLLL list = new SLLL();
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.addLast(40);
		//list.addPosition(3, 50);
		
		list.addPositionAhead(1, 100);
		list.addPositionBehind(3, 1000);
		
		list.display();
	}

}
