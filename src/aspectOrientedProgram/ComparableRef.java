package aspectOrientedProgram;

import DAO.Emp;
/**
 * Ex: emp.<b>compareTo(emp2)</b> <br>
 * this > arg object -> 1
 * this == arg object -> 0
 * this < arg object -> -1 
 */

public class ComparableRef {

	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.setName("saravan");
		emp.setId(100);

		Emp emp2 = new Emp();
		emp2.setName("saravanan");
		emp2.setId(200);
		
		System.out.println("compareTo = " + emp.compareTo(emp2));
	}
}
