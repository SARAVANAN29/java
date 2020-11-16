package capgemini;

import java.io.FileNotFoundException;

class A{
	public static void getprint() {
		System.out.println("parent A");
	}
}

class B extends A{
	public static void getprint() {
		System.out.println("child B");
	}
}

public class OverridingTest{

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		B a = new B();
//		a.getprint();
		
		
		TestCls cls = new Quaterly();
		cls.getTestMark();
		cls.getTestSub();
	}

}
