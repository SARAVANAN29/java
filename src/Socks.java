import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Socks{

	Test aTest = new Test();
//	aTest.getPrint();
//	Test.
	
		
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	Arrays.sort(ar);
    	int count=0;
    	for(int i=0; i<ar.length-1; i++)
    	{ 
    		if(ar[i] == ar[i+1])
    		{
    			count++;
    			i++;
    		}
    	}
//    	int count=0;
//    	int x,y;
    	
//    	System.out.println(count);
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
