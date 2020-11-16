package Chumma;

public class Set {
	private static int alength;
	public static void main(String [] saravanan) {
		int a[] = {1,2,3,4,5,-1,-2,-8,-11};
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		alength = a.length;
		System.out.println("Length of array -> "+alength );
		for(int a1 : a )
		{
			System.out.println(a1);
		}
	}
}
