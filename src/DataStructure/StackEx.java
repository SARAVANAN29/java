package DataStructure;

import java.util.Scanner;
import java.util.Stack;
public class StackEx {
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		Stack<String> a = new Stack<>();
		while (sc.hasNext()) {
			String input=sc.next();
			System.out.println(input);
			a.push(input);
//			getCheck(input);
		}
		System.out.println("while loop ends");
//		a.forEach(i -> {
//			System.out.println(i);
//			System.out.println(getCheck(i));
//		});
		sc.close();
	}

	private static boolean getCheck(String s)
	{
		System.out.println("***" + s);
		while (s.length() != 0) {
			s.replaceAll("{}|()|[]", "");
			System.out.println(s);
		}
		return s.length() != 0 ? false : true;
	}
}
