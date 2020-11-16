
public class Exception1{

	public static void main(String[] args) {
		
		
		int i =10;
		try {
			i=i/0;
		} catch (Exception e) {
			System.err.println("insidw"+e);
		}
	}

}
