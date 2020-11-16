package DataStructure;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String [] bubble) {
		int arr[] = {80, 60, 100, 45, 90};
		int l = arr.length;
		for(int j=0; j<l; j++)
		{
			for(int i=0; i<l-1-j; i++)
			{
			if(arr[i] > arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			}
			
		}
		
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
		
		Arrays.sort(arr);
	}
	
}
