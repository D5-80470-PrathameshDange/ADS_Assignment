
public class Tester {
	public static void nonRepeat(int arr[])
	{
		int f=0;
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			f=0;
			for(int j=0 ; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					f++;
				}
			}
			if(f < 2 )
			{
				System.out.println("First Non Repeating number: "+arr[i]);
				System.exit(0);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = { 1, 2,5, 3, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		nonRepeat(arr);
		//System.out.println("First Non Repeating number - " + r);
		
		
		

	}

}
