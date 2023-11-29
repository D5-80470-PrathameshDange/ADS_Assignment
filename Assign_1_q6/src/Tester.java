import java.util.Scanner;

public class Tester {

	public static int linearSearch(int arr[])
	{
		System.out.print("Enter element to check occurance: ");
		int ele = new Scanner(System.in).nextInt();
		System.out.print("Enter nth occurence: ");
		int occurence = new Scanner(System.in).nextInt();
		int count=0;
		int index= -1;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] == ele)
			{
				count++;
			}
				if(count == occurence)
				{
					count=0;
					index=i;
					break;
				}
			}
	return index;
}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 2,0, 4, -1, 7, 8 };
		int r = linearSearch(arr);
		if(r == -1)
			System.out.println("Element not found");
		else {
			System.out.println("Element found at index:"+r);
		}

	}

}
