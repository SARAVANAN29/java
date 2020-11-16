package Chumma;
class x{
	
}

class y{
	
}

interface intx{
	default public int print(int a) {
		return a*a;
	}
}
interface intf extends intx{
	default void print() {
		System.out.println("Hi");
	}
}
public class Aa implements intf, intx {

	public Aa() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String ... args) {
		Aa a = new Aa();
		System.out.println(a.print(5));
		
		intx x = new Aa();
		int xyz= x.print(10);
		System.out.println(xyz);
}
}