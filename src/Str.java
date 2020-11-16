
public class Str {
	private Str() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new String("sa")==new String("sa"));
		int n = 0b00000000000000000001111;
		System.out.println(n);
		Class cls;
		try {
			cls = Class.forName("Str");
			Str s = (Str) cls.newInstance();
			System.out.println(s.getClass().getName());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
