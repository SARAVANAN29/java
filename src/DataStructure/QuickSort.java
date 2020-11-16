package DataStructure;
/**
 * 
 * @author saravanan
 * 
 * 
 * choose pivot is as a last element of the array
 * recursive
 *
 */
public class QuickSort {
	static int count = 0;
	public static void main(String [] quick) {
		int arr[] = {10, 50, 65, 45, 9, 100, 80, 74};//8
//		int arr[] = {10, 80, 30, 90, 40, 50, 70};
//		int arr[] = {6, 5, 3, 1, 8, 7, 2, 4};
		quickSort(arr, 0, arr.length-1);
		for(int t : arr)
		{
			System.out.print(t + " ");
		}
		System.out.println(count);
	}
	
	public  static void quickSort(int[] arr, int st, int end) {
		if(st < end) {
		
		int part = partition(arr, st, end);
		quickSort(arr, st, part-1);
		quickSort(arr, part+1, end);
		
		}
	}
	
	public static int partition(int[] arr, int st, int end) {
		int pivot = arr[end];
		int i = (st -1 );
		
		for(int j= st; j< end ; j++)
		{
			if(arr[j] <= pivot)
			{
//				System.out.println("current i " + i);
				i++;
				swap(i, j, arr);
			}
		}
		
		swap(i+1, end, arr);
		
		return i+1;
	}


	static void swap(int a, int b, int[] arr){
//		System.out.println("bfr swap "+ arr[a] + " " + arr[b]);

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

//		System.out.println("after swap "+ arr[a] + " " + arr[b]);
	}
}
