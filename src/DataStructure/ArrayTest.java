package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[] = {1, -2, 4, -5, 1};
		int count = 1;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
//			System.out.println(a[i]);
		}
		int sum = getSum(a);
		System.out.println("sum = " + sum);
		for(int t=1; t<=a.length; t++)
		{
			int temp = 0;
			for(int x=0,y=t; y<=a.length; y++, x++)
			{
				for(int q=x; q<y; q++)
				{
					temp += a[q];
				}
//				System.out.println("total = " + temp);
//				System.out.println();
				if(temp < 0)
					count++;
			}
			temp = 0;
		}
		System.out.println(" count " + count);
//		ref copycat.class
	} 
	
	public static int getSum(int[] sumArr)
	{
		return Arrays.stream(sumArr).sum();
	}

}
