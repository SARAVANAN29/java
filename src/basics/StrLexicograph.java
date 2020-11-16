package basics;

import java.util.Arrays;
import java.util.Scanner;

public class StrLexicograph {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		java.util.List<String> list = new java.util.ArrayList();
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		for(int i=0; i<s.length()-k+1; i++)
		{
			list.add(s.substring(i, i+k));
		}
		java.util.Collections.sort(list);
		smallest = list.get(0);
		largest = list.get(list.size()-1);
		return smallest + "\n" + largest;
	}
	
//	public static String getSmallestAndLargest(String s, int k) {
//		String smallest = "";
//		String largest = "";
//		String[] str = new String[100];
//		for(int i=0; i<s.length()-k+1; i++)
//			{
//				str[i] = s.substring(i, i+3);
//			}
//		Arrays.sort(str);
//		
//		smallest = str[0];
//		largest = str[str.length-1];
//		return smallest + "\n" + largest;
//	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}