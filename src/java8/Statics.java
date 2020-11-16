package java8;

public class Statics {

	public Statics() {
		// TODO Auto-generated constructor stub
	}
	
	void print() {
		System.out.println(x);
		x++;
		System.out.println(x);
		}
	int x=1;
	static int xy =1;
	public static void main(String [] ar) {
		Statics s  = new Statics();
		s.x++;
//		s.print();
//		System.out.println(x);
//		
//		while(n==0)
//		{
//			static x =0;
//		}
		
		int n=2;
		int xy =1;
		while(n>0) {
			System.out.println(xy);
			xy++;
			n--;
			
		}
		
//		System.out.println(x+"   "+xy);
	}
	

}
