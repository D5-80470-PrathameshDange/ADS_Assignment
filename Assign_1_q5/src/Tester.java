import java.util.Scanner;

public class Tester {

	public static int binarySearch(int arr[])
	{
		int left=0, right=arr.length-1, mid=0;
		System.out.print("Enter Key: ");
		
		int key=new Scanner(System.in).nextInt();
		
		while(left <= right) {
			mid = (left+right) / 2;
		if(arr[mid] == key)
		{
			return mid;
		}
		else if(key > arr[mid])
		{
			left = 0;
			right = mid-1;
		}
		else if(key < arr[mid])
		{
			left = mid+1;
			
		}
		}
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {9, 7, 6, 4, 2, 1};
		int r = binarySearch(arr);
		System.out.println("Element at index: "+r);
	}

}
