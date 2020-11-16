package basics;

import java.util.Scanner;

public class CheckingValidUN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while (n --> 0) {
			String userName = sc.nextLine();
			if((userName.length() >= 8) && !userName.contains("?"))
			{
				System.out.println(userName);
				if(userName.matches("^[A-z]+.*")) {
					System.out.println("Valid");
				}
				else {
					System.out.println("Invalid");
				}
			}
			else {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}

}
