import java.util.Arrays;

public class selectionSort {

	public static void selectionSort(int arr[], int n) {
		int count=0;
		for(int i=0 ; i < n-1 ; i++) {
			
			for(int j=i+1 ; j < n ; j++) {
				count++;
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Comparisions: "+count);
	}

	public static void main(String[] args) {
			int arr[] = {1,3,6,2,5,7};
			System.out.println("Before sort: "+Arrays.toString(arr));
			selectionSort(arr, arr.length);
			//Arrays.sort(arr);
			System.out.println("After Sort: "+Arrays.toString(arr));
	}

}
