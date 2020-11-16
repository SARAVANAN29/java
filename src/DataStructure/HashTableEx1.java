package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HashTableEx1 {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		List<String> aList = Arrays.asList(magazine);
		ArrayList<String> myList = new ArrayList<String>(aList);
		int temp = 0;
		for(String a : note)
		{
			if(myList.contains(a)) {
				myList.remove(a);
				temp++;
			}
			else {
				System.out.println("No");
				break;
			}
			if(temp == note.length)
			{
				System.out.println("Yes");
			}
		}
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
