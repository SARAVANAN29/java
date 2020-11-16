package Lamda;

class A extends Thread{

	public void run() {
		System.out.println("A st");
		for(int i=0; i<5; i++)
		{
			System.out.println(i);
			if(i==2)
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}

class B extends Thread{
	
	public synchronized void run() {
		System.out.println("B st");
		for(int i=0; i<5; i++)
		{
			System.out.println(i);
			try {
				sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Testing1 {

	public static void main(String [] sara) {
		
		A a = new A();
		B b = new B();
		b.setPriority(Thread.MAX_PRIORITY);
		a.setPriority(2);
		a.start();
		b.start();
	}

}
