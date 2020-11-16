package Chumma;

class Test {
	public  void show() {
		System.out.println("base");
	}
	public Test() {
		System.out.println("no arg cons");
	}
	public Test(int i) {
		System.out.println(i);
	}
}

public class Agilesis extends Test{
	public  void show() {
		super.show();
		System.out.println("this  is main");
	}
//	Test t1 = new Test();
//	Test t2 = new Test(0);
//	static int i = 90;
	int i;
	/*
	 * if i inside static block. we can't able to use it in outside.
	 */
	static {
		int i = 120;
	}
	
	public static void main(String [] sara)
	{
		//for local variable no need to initialize.
//		int x;
//		System.out.println(i);
//		Test t1 = new Test();
//		Test.show();
//		t1.show();
//		System.out.println(i);
		Agilesis cAgilesis = new Agilesis();
		cAgilesis.show();
		
	}
}
