
public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		
		if(a & getType())
		{
			System.out.println("if");
		}
	}

	public static boolean getType() {
		System.out.println("**** printitng ");
		return false;
	}
}

