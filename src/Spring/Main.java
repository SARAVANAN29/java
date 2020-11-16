package Spring;

public class Main extends TextEditor{

	

	public Main(Abc a) {
		super(a);
	}

	public static void main(String [] ar) {
	Abc a = new Abc();
	new TextEditor(a);
	}
}
