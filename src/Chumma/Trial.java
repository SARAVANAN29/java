package Chumma;

interface Foo{
	int x = 10;
	static int getMethod() {
		return 0;
	}
	
//	void getPrint();
}

public class Trial implements Foo{

	/*public static void main(String[] args) {
//		int x = 20;
//		Foo.x = 30; //Interface variable are final.
		System.out.println(Foo.x);
		
	}*/
	
/*public static void main(String[] args) {
		
		int x = 10*20-20;
		
		System.out.println(x);
	}*/
	/*public static void main(String[] argss) {
		try {
			throw new Exception("Hello ");
		}catch(Exception e) {
			System.out.print(e.getMessage());
			System.out.println("***");
		} catch(IOException e) { // run time in this line
			System.out.print(e.getMessage());
		} finally {
			System.out.println("World");
		}
	}*/

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("ab")+"c";
		System.out.println("***");
		System.out.println(new String("abc").equals(new String("ab")+"c"));
	}

	
}