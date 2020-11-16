import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while(n --> 0) {
			String sentence = sc.nextLine();
			System.out.println(getRegex(sentence));
		}
		sc.close();
		System.exit(0);
	}

	public static String getRegex(String sen)
	{
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern duplicateCheck = Pattern.compile(regex);
		Matcher matcher = duplicateCheck.matcher(sen);
		while(matcher.find()) {
			sen = sen.replaceAll(matcher.group(), matcher.group(1));
		}
		return sen;
	}
}
