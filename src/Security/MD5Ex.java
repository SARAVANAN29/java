package Security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.nextLine();
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] byteMD = md.digest(s.getBytes());
			for(byte b :  byteMD) {
				System.out.printf("%02x", b);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
