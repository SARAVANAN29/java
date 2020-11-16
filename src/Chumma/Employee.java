package Chumma;

public class Employee {
	EmployeeGetterSetter e = new EmployeeGetterSetter("sara", 22, Gender.M);
	Gender g = Gender.M;
	Gender g1;
	public Gender getG1() {
		System.out.println(g1);
		return g1;
		
	}
	public void setG1(Gender g1) {
		this.g1 = g1;
	}
	public static void main(String []arg) {
	Employee e1 = new Employee();
	e1.setG1(Gender.M);
	e1.getG1();
	}
	
	
}
