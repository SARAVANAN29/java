package aspectOrientedProgram;

import DAO.Emp;


/**
 * Ex: emp.compare(emp2,emp3)<br>
 * compare method requires 2 objects as argument, 
 * if a high than b it returns positive, 
 * if equals then it returns 0,
 * if a less than b then it returns -1
 */
public class ComparatorRef {
	
	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.setName("saravan");
		emp.setId(100);

		Emp emp2 = new Emp();
		emp2.setName("saravanan");
		emp2.setId(200);
		
		Emp emp3 = new Emp();
		emp3.setName("sara");
		emp3.setId(300);
		
		System.out.println("compareTo = " + emp.compare(emp2,emp3));
	}
}
