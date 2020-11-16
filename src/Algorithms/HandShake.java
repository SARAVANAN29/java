package Algorithms;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HandShake {

	/*
	 * Complete the handshake function below.
	 */
	static int output;
	static int handshake(int n) {
		/*
		 * Write your code here.
		 */
		if(n == 1 || n == 0)
		{
			return 0;
		}else {
			n = n-1;
			return handS(n)+1;
		}
	}
	
	static int handS(int n)
	{
		if(n == 1 || n == 0)
		{
			return 0;
		}
		else
		{
			output = n + handS(n-1);
			return  output;
		}
	}
	

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(scanner.nextLine().trim());

		for (int tItr = 0; tItr < t; tItr++) {
			int n = Integer.parseInt(scanner.nextLine().trim());

			int result = handshake(n);
			System.out.println(result);
			//            bufferedWriter.write(String.valueOf(result));
			//            bufferedWriter.newLine();
		}

		//        bufferedWriter.close();
	}
}
