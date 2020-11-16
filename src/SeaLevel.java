import java.io.IOException;
import java.util.Scanner;

public class SeaLevel {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int myLogic=0, seaLevel =0;
    	char[] a = s.toCharArray();
    	for(char base : a)
    	{
    		if(base=='D') { 
//    			myLogic--;
    			if(seaLevel ==0) {
    				myLogic++;
    			}
    			seaLevel--;
    			}
    		if(base=='U') {
    			
    			
    			seaLevel++;
    			
    		}
    		
    	}
//		System.out.println("mylog"+ myLogic);

//    	System.out.print("-");
    	
    	return myLogic;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
/**
**
*
*
*
8
UDDDUDUU
12
DDUUDDUDUUUD
**
**
**/

