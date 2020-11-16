package Thread;

public class MainThread extends Thread{
	public static void main(String [] arg)
	{
		Thread t1 = new Thread();
//		MainThread t1 = new MainThread();
		t1.start();
		t1.run();

	}
	@Override
	public void run() {
		System.out.println("Thread running");
		System.out.println(this.getState());
		System.out.println(this.getName());
		System.out.println(this.getPriority());
	}

	public void toPrint() {

	}
}

class GenericType{
	public void genricMethod(){

	}
}