public class factorial {

	public static void main(String [] a) {
		int n = 5;
//		if(n==1 | n==0)
//		{
//			n=(n==1)? 1: 0;
//			System.out.println("out "+n);
//		}
//		else {
//			System.out.println("I am else");
//		}
		int p = fact(n);
		System.out.println(p);
		
	}
	
	public static int fact(int i){
		if(i==1 | i==0)
			{
				return (i==1)? 1: 0;
			}
		else {
			if(i != 0 ) {
				return i*fact(i-1);
			}
			return 0;
			}
	}
}
