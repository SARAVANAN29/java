package Lamda;

import java.util.Arrays;
import java.util.List;

public class Lam1 implements Lam2{
	public void print()
	{
		System.out.println("Hi");
	}
	
	
	
	public static void main(String[] args) {
		Lam2.printStaic();
		
		Lam1 a = new Lam1();
		a.printDefult();
		
		
		//List  l = new ArrayList(1,2,3);
		
		List l = Arrays.asList(1,2,3,4,5);
		System.out.println(l.indexOf(3));
	}

}
