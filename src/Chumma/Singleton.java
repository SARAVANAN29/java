package Chumma;


class Single{
	private static Single s =null;  //private static var
	public static String str;
	private Single(){} //private constructor
	
	public static Single singlemethod() {   //static public method
		if(s ==null)
		{
			s = new Single();
		}
		return s;
	}
	
}
public class Singleton {
	public static void main(String args[]) {
		String ss =  Single.singlemethod().str;
		System.out.println(ss);
		
	}

}
