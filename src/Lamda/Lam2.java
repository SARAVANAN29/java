package Lamda;

public interface Lam2 {
	
	static void printStaic() {
		System.out.println("This is static interface");
	}
	
	default void printDefult() {
		System.out.println("This is default interface");
	}

}
