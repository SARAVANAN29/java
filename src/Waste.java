import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
 *sample output 
1 
1
4
1 2 3 4
 */

public class Waste{
	static int M = 1;
	static int N = 1;
	static int size = 4;
		static List<int[]> mainList = new ArrayList<>();

	static int[] arr = {1,2,3,4}, arr1= {2,3,4,5},arr2= {0,1,2,3};
	public static void main(String[] sar)
	{
		mainList.add(arr);
		mainList.add(arr1);
		mainList.add(arr2);
		for(int[] arr : mainList) {
//			arr=l;
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
			getAr(arr);
		}
			
//	 int[] getAr(arr) {
//		
//		}
//		System.out.println(mainList.size());
//		for(int x=0; x<arr2.length; x++) {
//			for(int y=1; y<arr.length; y++) {
//				for(int z=0; z<arr1.length; z++)
//				{
//					System.out.print(arr2[x]+" "+arr[y]+" "+arr1[z]);
//					System.out.println();
//				}
//			}
//		}
			for(int i=0; i<size; i++)
			{
				
			}
		
		
}
	private static void getAr(int[] arr3) {
		for(int times=1; times<=N; times++)
		{
			for(int i=0; i<size; i++)
			{
				arr[i] = arr[i]+(M*times);
				
			}
			mainList.add(arr);
		}
		return;		
	}
}