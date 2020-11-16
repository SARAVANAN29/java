package Chumma;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindA {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	
    	if(s.length() == 1) {
    		return n;
    	}
    	String myString = multiply(s,n);

    	long no = (int) Integer.toUnsignedLong((int) n);
    	myString = myString.substring(0, (int)no);
    	Pattern regexPattern = Pattern.compile("a");
    	Matcher matcher = regexPattern.matcher(myString);
    	int i=0;
    	while (matcher.find()) {
    		i++;
		}
    	return i;
    	
    }

    
	private static String multiply(String s, long n) {
		int l = s.length();
		int not = (int) Integer.toUnsignedLong((int) Math.incrementExact(n/l));
		String temp = "";
		for(int i=1; i<=not; i++) {
			temp = s + temp;
		}
		System.out.println(temp);
		return temp;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
