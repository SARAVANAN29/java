package Chumma;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		for(int x=0; x<=i; x++)
		{
			System.out.print(fibno(x) + " ");
		}
		
	}

	private static int fibno(int i) {
		// TODO Auto-generated method stub
		if(i == 0) {
			return 0;
		}
		else if (i == 1) {
			return 1;
		}
		else
		{
			return fibno(i - 1) + fibno(i - 2 );
		}
	}
}
