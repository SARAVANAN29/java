package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class NegArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int sum = getSum(a);

		int count = 1, pos=1;
		for(int t=1; t<=a.length; t++)
		{
			int temp = 0;
			for(int x=0,y=t; y<=a.length; y++, x++)
			{
				for(int q=x; q<y; q++)
				{
					temp += a[q];
				}
				if(temp < 0)
				{count++;}
				else {
					pos++;
				}
			}
			temp = 0;
		}

		if(sum > 0)
		{
			count = pos;
		}
		System.out.println(count);
		sc.close();
	} 

	public static int getSum(int[] sumArr)
	{
		return Arrays.stream(sumArr).sum();
	}

}
