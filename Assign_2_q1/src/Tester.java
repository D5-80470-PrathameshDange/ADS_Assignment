import java.util.Arrays;

public class Tester {
//Write a insertion sort function to sort array and returns no of comparisions.
	
	public static void insertionSort(int arr[], int n)
	{
		int comps=0;
		for(int i=1 ; i < n ; i++)
		{
			int temp = arr[i];
			int j;
			for(j = i-1 ; j>=0 && arr[j] > temp ; j--)
			{
				comps++;
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		System.out.println("total comparisions: "+comps);
	}
	
	
	public static void main(String[] args) {
		int arr[] = {49,58,25,36,61,12};
		System.out.println("Array before sort: "+Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort: "+Arrays.toString(arr));
	}

}
