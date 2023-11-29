import java.util.Scanner;

public class Tester {
	public static void  linearSearch(int arr[] , int key)
	{
		int count=0;
		for(int i=0 ; i < arr.length ; i++)
		{
			
			count++;
			if(arr[i] == key)
			{
				break;
				//return i;
			}
		}
		System.out.println("No. of Comparisions in linear Search: "+count);
		count = 0;
	}
	public static void binarySearch(int arr[], int key)
	{
		int cnt=0,mid;
		int left=0, right=arr.length-1;
		while(left <= right)
		{
			cnt++;
			mid = (left + right) / 2;
			if(arr[mid] == key)
			{
				System.out.println("No. of Comparisions in Binary search: "+cnt);
				break;
			}
			else if(key > arr[mid])
			{
				left = mid+1;
			}
			else if(key < arr[mid])
			{
				right = mid - 1;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,30,40,50,60,70,80,90};
		int key, i;
		System.out.print("Enter key to find: ");
		key = sc.nextInt();
		linearSearch(arr, key);
		//System.out.println("key found at : "+i);
		
		binarySearch(arr, key);
		
	}

}
