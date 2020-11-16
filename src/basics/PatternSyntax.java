package basics;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntax {
	public static void main(String... ar) {
		Scanner sc = new Scanner(System.in);
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,}";
		int n = Integer.parseInt(sc.next());
		while(n --> 0)
		{
			String pattern = sc.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
	}
}
