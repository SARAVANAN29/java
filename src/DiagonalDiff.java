import java.io.IOException;
import java.util.Scanner;

public class DiagonalDiff {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr, int n) {
//		0,1,2
    	int tempA =0, tempB=0, output;
//    	for(int i=0; i<n; i++) {
//    		for(int j=0; j<n; j++) {
//    			temp = arr[i][j] + temp;
//    		}
//    	}
    	int i=0, j=0;
    	for(int x=0; x<n; x++) {
    	tempA = arr[i][j] + tempA;
    	i++;
    	j++;
//    	return tempA;
//    	System.out.println("--->"+tempA);
    	}

    	int i1=0, j1=n-1;
    	for(int y=0; y<n; y++) {
        	tempB = arr[i1][j1] + tempB;
        	i1++;
        	j1--;
//        	return tempB;
//        	System.out.println("--->"+tempB);
        	}
    	output = tempA-tempB;
    	return Math.abs(output);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr, n);
System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
