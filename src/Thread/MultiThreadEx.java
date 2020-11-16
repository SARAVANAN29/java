package Thread;

public class MultiThreadEx {
	public static void main(String[] arg) {
	Print print = new Print();
	A obj1 = new A(print , "$");
	B obj2 = new B(print , "%");
	obj1.start();
//	try {
//		obj1.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	obj2.start();
	System.out.println("The end");
	}
}



class Print{
	 void getPrint(String i) {
		int t= 10;
		synchronized (this) {
			System.out.println(this);
			while (t --> 0) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

class A extends Thread
{
	Print p;
	String string;
	A(Print p, String a) {
		this.p=p;
		this.string=a;
		System.out.println(a);
	}
	public void run() {
		System.out.println("run");
		p.getPrint(string);
	}
}

class B extends Thread
{
	Print p;
	String string;
	B(Print p, String a) {
		this.p=p;
		this.string=a;
		System.out.println(a);
	}
	public void run() {
		System.out.println("run");
		p.getPrint(string);
	}
}