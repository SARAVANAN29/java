package sellaSoftware;

public class Test2 {
	public static String regex = "()";
	public static void main(String[] args) {
		String str = "(())()(((()";
		System.out.println("output = " + getCount(str));
	}
	
	public static int getCount(String s) {
		int count = 0;
		while (s.contains("()")) {
			s = s.replaceFirst("\\(\\)", "");
			count++;
			System.out.println("s = " + s);
			System.out.println(count);
		}
		
		return count;
	}
}


//(())()(((() --> have to find out the () count