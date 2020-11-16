package Chumma;

public class Worst {
	public static void main(String[] args) {
		int a[] = {5,3,4,1,2};
		
		for(int i = 0; i<a.length-1; i++)
		{
			for(int j =i+1; j<a.length; j++)
			{
				if(a[i]>a[j]) {
				System.out.println( "bfr swap " + a[i]+ "  "+ a[j] );
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				System.out.println( "afr swap " + a[i]+ "  "+ a[j] );
				}

//				for(int a1 : a) {
//					System.out.print (a1 + " ");
//				}
			}
			System.out.println();

			for(int a1 : a) {
				System.out.print(a1 + " ");
			}
			System.out.println();

		}
//		System.out.println(a);
		
	}
}
