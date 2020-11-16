package DataStructure;
/**
 * 
 * @author saravanan
 * 
 * 
 * time complexity of linear search is O(N). because every element checked only once. 
 *
 */
public class LinearSearch {

	public static void main(String [] linear) {
		int arr[] = {80, 60, 100, 45, 90};
		int need = 100;
		for(int i=0; i <arr.length; i++)
		{
			if(arr[i] == need)
				System.out.println("yes it is -> " + i+1 );
		}
	}
}
