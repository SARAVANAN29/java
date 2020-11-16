import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Crash {

    // Complete the arrayManipulation function below.
    static int arrayManipulation(int n, int m , int[][] queries) {
    	int arr[] = new int[n];
    	Set max = new HashSet<>();

    	for(int count=0; count<m; count++)
    	{
//    		int st = queries[count][0];
//    		int end = queries[count][1];
//    		int op = queries[count][2];
//    		for(int i=st-1; i<=end-1; i++)
//    		{
//                max.add(arr[i] += op);
//    		}
    		
    		int st = queries[0][0];
            int end = queries[0][1];
            int op = queries[count][2];
            
            for(int i=st-1; i<=end-1; i++)
            {
                max.add(arr[i] += op);
            }
    	}
    	
    	return (int) Collections.max(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

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

        long result = arrayManipulation(n, m, queries);
        System.out.println(result);
        
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
