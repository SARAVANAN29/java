package basics;

import java.util.Arrays;
import java.util.Scanner;
/***
 * 
 * @author saravanant
 * example
 * anagramm
 * marganaa
 * 
 * Not anagrams
 * 
 * Hello
 * hello
 * 
 * anagrams
 *
 */

public class Anagram {

	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();
		
		Arrays.sort(aa);
		Arrays.sort(bb);
		
		if(a.length() == b.length()) {
			int t = 0;
			for (int i = 0; i < bb.length; i++) {
				if(aa[i] == bb[i])
				{
					t++;
				}
				else {
					break;
				}
			}
			return t == a.length() ?  true : false;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//		String a = scan.next();
		String a = "anagramm";
		String b = "marganaa";
//		a = "hello";
//		b = "Hello";
		//		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}

