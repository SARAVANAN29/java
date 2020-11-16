package Chumma;
//polymorphism
class Abc{
	Abc(){
		System.out.println("A cons");
	}
	public void getpoly() {
		System.out.println("A");
	}
}

class B extends Abc{
//	super()
	B(){ super(); 		System.out.println("B cons");}
	@Override
	public void getpoly() {
		System.out.println("B");
	}
}

class C extends Abc{
	C(){ super(); 		System.out.println("C cons");}
	@Override
	public void getpoly() {
		System.out.println("C");
	}
}

public class TEst1 {
	public static void main(String [] sara) {
//		Abc a = new B();
		C a = new C();
		a.getpoly();
		try {
			System.out.println(C.class.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
