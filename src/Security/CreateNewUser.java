package Security;

import java.util.logging.Logger;

public class CreateNewUser{
	
	String newUser;
	String newPass;
	public Logger logger = Logger.getLogger("CreateNewUser.class");
	public CreateNewUser(String newUser, String newPass) {
		super();
		System.out.println(newUser + " = a8@@31"+newPass.hashCode());
		logger.info("Creating on progress ...!"+newUser+" "+ "a8@@31"+newPass.hashCode());
		CredentialList cc = new CredentialList(newUser,newPass);
		logger.info("Username  == "+newUser);
		logger.info("Password  == a8@@31"+newPass.hashCode());
		cc.setCredentials();
	}
	
}
