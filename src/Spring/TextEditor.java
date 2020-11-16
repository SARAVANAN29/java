package Spring;

/*public class TextEditor {
	private Abc abc;
	public TextEditor() {
		this.abc = new Abc();
		abc.print();
	}

}*/
class Abc{
	public void print() {
		System.out.println("hi");
	}
}

public class TextEditor{
	private Abc abc;
	public TextEditor(Abc a) {
		this.abc = a;
		abc.print();
	}
	
}