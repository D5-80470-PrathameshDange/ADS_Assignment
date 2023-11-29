import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. Exit\n1. Push\n2. pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else
				{
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else {
					System.out.println("popped element: "+q.pop());
				}
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else {
					System.out.println("peeked element: "+q.peek());
				}
			default:
				break;
			}
			
	
		}while(choice != 0);

	}

}
