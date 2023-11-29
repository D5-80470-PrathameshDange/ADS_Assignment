
public class SLLLMain {

	public static void main(String[] args) {
		SLLL list = new SLLL();
		list.addFirst(60);
		list.addFirst(40);
		list.addFirst(20);
		list.display();
		
		list.addValue(25);
		list.display();
		
		list.addValue(50);
		list.display();
		//list.addValue(80);
		list.display();
		
	}

}
