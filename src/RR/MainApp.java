package RR;

import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

import Security.CreateNewUser;
import Security.CredentialList;

public class MainApp {
	static Scanner scanner;
	static int input;
	public static Logger logger;
	static String u,p;
	static String date = new Date().toString()+" : ";
	
	public synchronized static void main(String[] args) {
		scanner = new Scanner(System.in);
		logger= Logger.getLogger(date+"MainApp.class");
		System.out.println("********************************");
		System.out.println("Login  --> Press 1");
		System.out.println("Create New User  --> Press 2");
		System.out.println("Forgot password  --> Press 3");
		System.out.println("********************************");
		System.out.println();

		input = scanner.nextInt();
		
		switch (input) {
		case 1:
			logger.info(date+ "Logging currently...");
			System.out.println("User Name = \t");
			u = scanner.next();
			System.out.println("Password = \t");
			p = scanner.next();
//			CredentialList cList = new CredentialList(u, p);
			String cString = new CredentialList().getPrintCredentials();
			String check = new CredentialList().CheckList(u, p);
			System.out.println(check);
			break;
		case 2:
			CredentialList cre = new CredentialList();
			System.out.println(cre.printResult);
			logger.info(date+"Creating Account currently...");
			System.out.println("User Name = \t");
			System.out.println();
			u = scanner.next();
			System.out.println("Password = \t");
			System.out.println();
			p = scanner.next();
			logger.info(date+"Breath once ...");
			new CreateNewUser(u, p);
			logger.info("Account created successfully");
			break;
		case 3:
			logger.info("Forgotten password :");
			break;
		default:
			logger.info("Please click the proper one");
			break;
		}
		System.exit(0);
		
//		if(input==1) {
//			logger.info("Logging currently...");
//			System.out.println("User Name = \n");
//			u = scanner.next();
//			System.out.println("Password = ");
//			p = scanner.next();
////			CredentialList cList = new CredentialList(u, p);
//			String check = new CredentialList().CheckList(u, p);
//			System.out.println(check);
//		}
//		else {
//			CredentialList cre = new CredentialList();
//			System.out.println(cre.printResult);
//			logger.info("Creating Account currently...");
//			System.out.println("User Name = \n");
//			u = scanner.next();
//			System.out.println("Password = ");
//			p = scanner.next();
//			logger.info("Breath once ...");
//			new CreateNewUser(u, p);
//			logger.info("Account created successfully");
//		}
	}
}
