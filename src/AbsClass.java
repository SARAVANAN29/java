interface i{
	public void name();
}
abstract class AbsClass implements i{
	public abstract void mode();
	public static void run() {
		System.out.println("abs");
	}
}
//public class AbsClass extends AbsClass{
//
//	@Override
//	public void name() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void mode() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public static void main(String [] aa)
//	{
//		
//	}
//	
//}