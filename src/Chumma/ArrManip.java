package Chumma;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class ArrManip {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int m , int[][] queries) {
   
        int myArr[] = new int[n];
        Arrays.asList(queries).parallelStream().forEach(p -> {
        	int st = p[0]-1, end = p[1], adder = p[2];
        	LongStream.range(st, end).parallel().forEach(a -> myArr[(int)a] += adder);
        	});;
//        for(int i=0; i<m; i++)
//        {
//            int st = queries[i][0]-1, end = queries[i][1]-1, adder = queries[i][2];
//            
//            for(int j = st; j <= end; j++) 
//            {
//                myArr[j] += adder;
//            }
//        }
        
        	System.out.println(Arrays.stream(myArr).max());
        return Arrays.stream(myArr).max().getAsInt();
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulationNew(n, m, queries);
        System.out.println(result);

        scanner.close();
    }

	private static long arrayManipulationNew(int n, int m, int[][] queries) {
		List<Integer> arrList = new ArrayList<Integer>();
		for(int i=0; i<m; i++)
		{
			 int st = queries[i][0]-1, end = queries[i][1]-1, adder = queries[i][2];
			 
		}
		
		return 0;
	}
}


    // Complete the arrayManipulation function below.
//    static int arrayManipulation(int n, int m , int[][] queries) {
//   
//    	int myArr[] = new int[n];
//    	for(int i=0; i<m; i++)
//    	{
//    		int st = queries[i][0]-1, end = queries[i][1]-1, adder = queries[i][2];
//    		
//    		for(int j = st; j <= end; j++) 
//    		{
//    			myArr[j] += adder;
//    		}
//    	}
//    	
//    	return Arrays.stream(myArr).max().getAsInt();
//    }

   