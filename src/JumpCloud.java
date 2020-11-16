import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JumpCloud {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] saravanan)
	{
		int path=0;
		 	int n = sc.nextInt();
	        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] c = new int[n];

	        String[] cItems = sc.nextLine().split(" ");
	        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cItems[i]);
	            c[i] = cItem;
	        }
	        
	        for(int i = 0 ; i < n-1; i++) {
	        	if(c[i] == c[i+1]) {
	        		i++;
	        		path++;
	        	}
	        	else
	        	{
	        		i++;
	        		path++;
	        	}
	        		
	        }
	        if(n%2 == 1) {
	        if(c[n-1] == 0) path++;
	        }
	        
//	        List l = new ArrayList<>();
//	        for(int c1 : c)
//	        {
//	        	l.add(c1);
//	        }
//	        int temp = (Collections.frequency(l, 0)-path)/4;
////	        System.out.println(Collections.frequency(l, 0));
			System.out.println(path);
	}

}
/*
*
6
0 0 0 0 1 0
8
0 1 0 0 0 1 0 0
7
0 0 1 0 0 1 0 
*
*/