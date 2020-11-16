import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array2D {

    // Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		ArrayList<Integer> totalList = new ArrayList<>();
		for(int c=0; c<=3; c++)
		{
			for(int r=0; r<=3; r++)
			{
				int count = 0, total = 0;
				for(int i=r; i<=r+2; i++)
				{
					for(int j=c; j<=c+2; j++)
					{
//						System.out.print("c== "+ c + "r== "+ r + "          ");
//						System.out.print("i== "+ i + "j== "+ j);
						if(count !=3 & count !=5) {
//						System.out.print(arr[i][j]);
						total = total + arr[i][j];
						}
						count++;
					}
//					System.out.println();
				}
				totalList.add(total);
//				System.out.println(total);
//				System.out.println();
			}
		}
		return Collections.max(totalList);
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}



/*
 * 
 * test case 1 
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
 * 
 */
