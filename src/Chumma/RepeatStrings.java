package Chumma;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatStrings {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		long strLength = s.length();
		String ss = s;
		long result = Long.MAX_VALUE;
//		System.out.println("strLn : " + strLength);
		long quotient = n % strLength;
//		System.out.println("quotient : " + quotient);
		s  = s.replaceAll("[b-z]+", "");
		if(quotient == 0)
		{
			result = (n/s.length());
		}
		else {
			long temp = (n - quotient);
			long mul = temp/strLength;
//			System.out.println("temp : " + temp + "  mul : " + mul);
			
			long remain = ss.substring(0, (int)quotient).replaceAll("[b-z]+", "").length();
//			System.out.println("remain : " + remain);
			
			result = (s.length()*mul) + remain ;
		}
		return result;
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

		//        bufferedWriter.close();

		scanner.close();
	}
}

