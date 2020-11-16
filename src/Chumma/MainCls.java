package Chumma;

import java.util.*;

class Studnt{
	private int id;
	private String fname;
	private double cgpa;
	public Studnt(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class MainCls
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Studnt> studentList = new ArrayList<Studnt>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Studnt st = new Studnt(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		studentList.sort(new Comparator<Studnt>() {

			@Override
			public int compare(Studnt o1, Studnt o2) {
				// TODO Auto-generated method stub
				double id1 = o1.getCgpa();
				double id2 = o2.getCgpa();
//				return ( id1 > id2  ) ? -1 : (id1 < id2) ? 1 : 0;
				return ( id1 == id2 ) ? o1.getFname().compareTo(o2.getFname()) : ( id1 < id2 ) ? 1 : -1; 
			}
		});

		for(Studnt st: studentList){
			System.out.println(st.getFname());
		}
	}
}
