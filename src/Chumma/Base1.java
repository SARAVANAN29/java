package Chumma;

public class Base1 extends Thread {
	
	public void run() {
		System.out.println("st");
		this.stop();
		System.out.println("end");
	}
	
	public static void main(
			String [] sss)
	{
		Base1 b1 = new Base1();
		b1.start();
//		b1.run();
	}

}
