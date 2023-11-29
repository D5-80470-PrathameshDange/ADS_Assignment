import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit\n1. Add\n2. Pop\n3. peek");
		int ch;
		
		
		do {
			System.out.print("Enter choice - ");
			 ch = sc.nextInt();
			switch (ch) {
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data to add : ");
					int v = sc.nextInt();
					st.push(v);
				}
				break;
			case 2:
				if(st.isEmpty())
				{
					System.out.println("Stack is empty");
				}
				else
				{
					st.pop();
				}
				break;
			case 3:
				if(st.isEmpty())
				{
					System.out.println("Stack is empty");
				}
				else {
					System.out.println("Peeked data : "+st.peek());
				}
				break;
				
			default:
				break;
			}
		}while(ch != 0);
		
		
	}

}
