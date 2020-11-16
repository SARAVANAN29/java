package DataStructure;

import java.util.Arrays;

public class MaxNoArr {

	public static void main(String[] args) {
		int[] a = {1 , -1, 2 , -2, 5};
		for(int i=0; i<a.length; i++)
		{
			if(i-1 >= 0) 
				a[i] += a[i-1]; 
		}
		
		Arrays.stream(a).forEach(i -> System.out.println(i));
	}

}
