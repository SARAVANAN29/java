package Chumma;
class Animal{
	public void walk() {
		System.out.println("I am walking");
	}
}

class  Bird extends Animal{
	public void fly() {
		System.out.println("I am flying");
	}
	public void sing() {
		System.out.println("I am singing");
	}
	public void walk() {
		System.out.println("I am child walking");
	}
}
public class Inheritance1{
	public static void main(String [] are) {
		
		System.out.println("a "+ 3 + 4);
		
	Bird b = new Bird();
	Animal a = new Animal();
	a.walk();
	b.fly();
	b.sing();
	}
}
