import java.util.Scanner;

public class Tester {
	
	public static int searchLastOccur(int arr[], int key)
	{
		for(int i=arr.length-1; i>=0 ; i--) {
			if(arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 2,0, 4, -1, 7, 8 };
		System.out.print("Enter key: ");
		int key = new Scanner(System.in).nextInt();
		int i = searchLastOccur(arr, key);
		System.out.println("Last occurence: "+i);
	}

}
