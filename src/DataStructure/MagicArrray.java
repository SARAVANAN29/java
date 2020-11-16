package DataStructure;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicArrray {
	static Set<Integer> set = new HashSet<>();
	static int t;
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	getCount(s);
    	set.forEach(i -> {t += Math.abs(15-i);});
    	return t;
    }
    
    private static void getCount(int[][] s) {
    	int rowTotal = 0, colTotal = 0, total = 0, diaTotal = 0, temp = 2;
    	for(int i=0; i<3; i++)
    	{
    		for(int j=0; j<3; j++)
    		{
    			rowTotal += s[i][j]; //row total
    			colTotal += s[j][i]; //col total
    		}
    		total += s[i][i]; //diagonal
    		diaTotal += s[i][temp];
    		temp--;
    		System.out.println("row = " + rowTotal + " " + Math.abs(15-rowTotal));
    		System.out.println("col = " + colTotal + " " + Math.abs(15-colTotal));
    		set.add(rowTotal);
    		set.add(colTotal);
    		rowTotal = 0; colTotal = 0;
    	}
    	set.add(total);
    	set.add(diaTotal);
    	System.out.println("diaTotal = " + diaTotal + " " + Math.abs(15-diaTotal));
    	System.out.println("dia = " + total + " " + Math.abs(15-total));
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}

//7 6 5 - 18
//7 2 8 - 17
//5 3 4 - 12
//Ans : 18
