package Chumma;

import java.io.Serializable;

public class TransientExm implements Serializable{
	private static final long serialVersionUID = 1L;
	transient final int a = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output = new TransientExm().a;
		System.out.println(new TransientExm().a);
	}
}
