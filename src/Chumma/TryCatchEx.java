package Chumma;

public class TryCatchEx {

	public static void main(String [] abc) 
	{
		int[] i = null;
		
		try {
			System.err.println(i[0]);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.err.println("Exception is " + e);
		}
	}
}
