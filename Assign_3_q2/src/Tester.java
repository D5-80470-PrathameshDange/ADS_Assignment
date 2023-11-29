import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		Stack st = new  Stack(5);
		for(int i=0 ; i < arr.length ; i++)
		{
			st.push(arr[i]);
		}
		
		System.out.println("Array before reverse: "+Arrays.toString(arr));
		
		System.out.println("Array after reverse:");
		for(int i=0; i < arr.length ; i++)
		{
			System.out.print(st.pop());
			if(i != arr.length-1) {
				System.out.print(",");
			}
		}
		

	}

}
