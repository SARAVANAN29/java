package Security;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CredentialList {
	private String username;
	private String password;
	public String printResult ,key, value;
	public Map<String, String> credentialList= new HashMap<>();

	
	public CredentialList() {}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public CredentialList(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	/*
	 * to checking the credentials
	 */
	public String CheckList(String u, String p) {
		Entry<String, String> a = null;
		credentialList
		.entrySet()
		.stream()
		.filter(cc -> cc.getKey().equals(u) && cc.getValue().equals(p))
		.forEach(aa -> {
			System.out.println(a.getKey() + "  " + a.getValue());
		});
		return 	a.getKey() + "  " + a.getValue();
	}	
	
	/*
	 * to Print the credentials
	 */
	public String getPrintCredentials() {
		credentialList
		.forEach((k,v) -> 
		{
			this.key =k;
			this.value = v;
			System.out.println("username = "+k+"||"+ "pass = "+v);
		}
		);
		return printResult = key+value;
	}
	
	/*
	 * to set the credentials
	 */
	public void setCredentials() {
		credentialList.put(username, password);
		credentialList.put("1", "1");
	}
	
}
