package basics;

import java.io.IOException;
import java.util.Scanner;

public class TwoStrings {

	// Complete the twoStrings function below.
	/*static String twoStrings(String s1, String s2) {
		String res = "NO";
		if(s1.length() > s2.length())
		{
			char[] ch = s2.toCharArray();
			for(char c : ch)
			{
				if(s1.contains(Character.toString(c)))
				{
					res = "YES";
					break;
				}
			}
		}
		else {
			char[] ch = s1.toCharArray();
			for(char c : ch)
			{
				if(s2.contains(Character.toString(c)))
				{
					res = "YES";
					break;
				}
			}
		
		}
		return res;
	}*/

	static String twoStrings(String s1, String s2) {
		String output = "NO";
		for (char i = 'a'; i <= 'z'; i++) {
			String s = Character.toString(i);
			if(s1.contains(s) && s2.contains(s)) {
				output = "YES";
				break;
			}
		}
		return output;
	}
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);

			//            bufferedWriter.write(result);
			System.out.println(result);
			//            bufferedWriter.newLine();
		}

		//        bufferedWriter.close();

		scanner.close();
	}
}
