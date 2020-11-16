package java8;

import java.util.Date;

public class RailwayPojo {

	private String Src_Plt;
	private String Dst_Plt;
	private int Plt_No;
	private float Amount;
	private Date time;
	
	public String getSrc_Plt() {
		return Src_Plt;
	}

	public void setSrc_Plt(String src_Plt) {
		Src_Plt = src_Plt;
	}

	public String getDst_Plt() {
		return Dst_Plt;
	}

	public void setDst_Plt(String dst_Plt) {
		Dst_Plt = dst_Plt;
	}

	public int getPlt_No() {
		return Plt_No;
	}

	public void setPlt_No(short plt_No) {
		Plt_No = plt_No;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	public Date getTime() {
		return time;
	}

	public void setTime() {
		this.time = new Time().getDate();
	}

	public RailwayPojo(String src_Plt, String dst_Plt, int plt_No, float amount, Date time) {
		this.Src_Plt = src_Plt;
		this.Dst_Plt = dst_Plt;
		this.Plt_No = plt_No;
		this.Amount = amount;
		this.time = new Time().getDate();
	}

	@Override
	public String toString() {
		return "RailwayPojo ["
			+ "Src_Plt=" + Src_Plt + ", "
			+ "Dst_Plt=" + Dst_Plt + ", "
			+ ".Plt_No=" + Plt_No + ", "
			+ "Amount=" + Amount
			+ ", time=" + time + "]";
	}

}
