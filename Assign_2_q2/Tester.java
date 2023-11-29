import java.util.Arrays;

public class Tester {

	public static void descInsertion(int arr[], int n)
	{
		for(int i =1; i < n ; i++)
		{
			int temp = arr[i];
			int j;
			for(j = i-1; j >= 0 && arr[j]<temp ; j--)
			{
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
			
			
		}
	}
	
	public static void main(String[] args) {
			int arr[] = {10,50,30,40,60,25,45};
			System.out.println("Array before Sort: " + Arrays.toString(arr));
			descInsertion(arr, arr.length);
			
			System.out.println("Array after Sort: " + Arrays.toString(arr));
	}

}
