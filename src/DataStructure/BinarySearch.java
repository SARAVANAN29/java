package DataStructure;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String [] arg) {
		int arr[] = {10, 50, 65, 45, 9, 100, 80, 74};//8
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print (i + " ");
			//9 10 45 50 65 74 80 100 
		}
		binarySearch(arr.length/2, arr);
	}
		public static int binarySearch(int mid, int [] arr)
		{
			int need = 100;
			if(arr[mid] == need)
			{
				System.out.println("position " + mid);
				System.exit(-1);
			}
			else if(arr[mid] > need) {
				
			}
			else if(arr[mid] > need) {

			}
			return 0;
		}
	}
