package Chumma;

import java.util.Scanner;
//Exception(String message, Throwable cause) 
class Ex extends Exception {
	Ex(String myExcep){
		super(myExcep);
	}
	Ex(String myExcep, Throwable e)
	{
		super(myExcep, e);
	}
}

public class MyException{
	
	public static void main(String [] java) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String s= scan.next();
		if( s.length() != 1 ) 
		{
			try {
				throw new Ex("This is worst");
			} 
			catch(Ex e){
				e.printStackTrace();
			}
			finally {
				System.out.println("try - catch - finally. This order only possible");
			}
		}
	}
}
