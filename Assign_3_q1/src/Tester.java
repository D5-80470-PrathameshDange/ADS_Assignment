import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		int value;
		for(int i=0 ; i<5 ; i++)
		{
			System.out.print("Enter value: ");
			value = new Scanner(System.in).nextInt();
			st.push(value);
		}
		
		int max=0;
		
		for(int i=0; i < 5 ; i++)
		{
			int temp = st.pop();
			if(max < temp)
			{
				max = temp;
			}
		}
		
		System.out.println("Max: "+max);

	}

}
