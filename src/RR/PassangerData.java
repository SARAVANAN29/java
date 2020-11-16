package RR;

public class PassangerData {
	private String Pname;
	private int Page;
	private PassengerGender Pgender;
	
	public PassangerData(String pname, int page, PassengerGender pgender) {
		super();
		this.Pname = pname;
		this.Page = page;
		this.Pgender = pgender;
	}

	public String getPname() {
		return this.Pname;
	}

	public int getPage() {
		return this.Page;
	}

	public PassengerGender getPgender() {
		return this.Pgender;
	}

	public void setPname(String pname) {
		this.Pname = pname;
	}

	public void setPage(int page) {
		this.Page = page;
	}

	public void setPgender(PassengerGender pgender) {
		this.Pgender = pgender;
	}

	@Override
	public String toString() {
		return "PassangerData [Pname=" + this.Pname + ", Page=" + this.Page + ", Pgender=" + this.Pgender + "]";
	}

}
