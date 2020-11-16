
public class TestHome {

		public static void main(String[] args) {
			
			String s1 = "selvam";
			String s2 = "selvam";
			
			System.out.println(s1==s2);
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		}
}

class Selvam {
	
	private int height;
	
	public Selvam(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Selvam [height=" + this.height + "]";
	}
}
