
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 5;
		//output will be 5 * 4 * 3 * 2 * 1 = 120;
		System.out.println(getFib(t));
		
	}
	
	public static int getFib(int i) {
		int output;
		if(i == 1)
		{
			output = i;
		}
		else 
		{
			output = i * getFib(i-1);
		}
		
		return output;
	}

}
