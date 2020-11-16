package Chumma;

import java.io.IOException;
import java.util.Scanner;

public class SubStringEx1 {

	// Complete the twoStrings function below.
	static String twoStrings(String s1, String s2) {
		char[] arr2 = s2.toCharArray();
		for(char a : arr2)
		{
			if(s1.contains(new Character(a).toString()))
				return "YES";
		}
		return "NO";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);
			System.out.println(result);
		}
		scanner.close();
	}
}
//Example:
//2
//hello
//world
//hi
//world
