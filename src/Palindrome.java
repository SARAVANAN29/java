
public class Palindrome {
	public static void main(String [] pa)
	{
		int ij = 177;
		int cal = (int) Math.sqrt(ij);
		System.out.println("sqrt  "+ cal);
		for (int i=2; i<=cal-1; i++)
		{
			System.out.println(ij%i);
			if(ij%i == 0) {
				System.out.println("pal " + i);
				System.exit(-1);
			}
		}
	}
}
