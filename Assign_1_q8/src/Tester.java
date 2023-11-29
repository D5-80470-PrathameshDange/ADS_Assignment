import java.util.Scanner;

public class Tester {
	public static int rankOfElement(int arr[])
	{
		int rank=0;
		System.out.print("Enter element to find rank- ");
		int a = new Scanner(System.in).nextInt();
		for(int i=0 ; i<arr.length ; i++) {
			if(a >= arr[i])
			{
				rank++;
			}
		}
		return rank;
	}
	
	
	public static void main(String[] args) {
			int arr[] = {10, 20, 15, 3, 4, 4, 1};
			int r = rankOfElement(arr);
			System.out.println("rank = "+r);
	}

}
