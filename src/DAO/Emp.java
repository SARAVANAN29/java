package DAO;

import java.util.Comparator;

public class Emp implements Comparable<Emp> , Comparator<Emp>{

	@Override
	public int compareTo(Emp o) {
		System.out.println("this = " + this);
		System.out.println("coming = " + o);
		return this.getId() - o.getId();
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + this.name + ", id=" + this.id + ", getName()=" + this.getName() + ", getId()="
				+ this.getId() + ", hashCode()=" + this.hashCode() + "]";
	}

	public String name;
	public int id;
	
	public Emp() {}
	
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (this.id != other.id)
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().length() - o2.getName().length() ;
	}
	
}