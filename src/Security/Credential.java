package Security;

public class Credential {
	private String uName;
	private String uPass;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	@Override
	public String toString() {
		return "Credential [uName=" + uName + ", uPass=" + uPass + "]";
	}
	public Credential(String uName, String uPass) {
		super();
		this.uName = uName;
		this.uPass = uPass;
	}
}
