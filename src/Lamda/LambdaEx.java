package Lamda;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	// Write your code here
	public static PerformOperation isOdd() {
		return (int a) -> (a%2 == 0) ? false : true;
	}

	public static PerformOperation isPrime() {
		return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(a)  ? true : false;
	}

	public static PerformOperation isPalindrome() {
		return (int a) -> new StringBuilder(Integer.toString(a)).equals(new StringBuilder(Integer.toString(a)).reverse()) ? true : false;
	}
}

public class LambdaEx {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		//  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner br = new Scanner(System.in);
		int T = Integer.parseInt(br.nextLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.nextLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
/*
5
1 4
2 5
3 898
1 3
2 12
 */
