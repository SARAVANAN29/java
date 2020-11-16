package Chumma;

public class EmployeeGetterSetter {
	
	String name;
	int age;
	Gender g;
	
	public EmployeeGetterSetter(String name, int age, Gender g){
		this.name = name;
		this.age=age;
		this.g=g;
		
	}
	public void setG(Gender g) {
		this.g = g;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "EmployeeGetterSetter [name=" + name + ", age=" + age + ", g=" + g + "]";
	}
	public void setAge(short age) {
		this.age = age;
	}
}
