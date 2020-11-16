import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

/***
 * @author saravanant
 * requirement
 * 
-t NYSEGTemplateProvider
-c MARDONALI=yukyuk
-h

into

-acquisition GreenvilleUtilitiesTemplateProvider
-acquisitionType CLASSIC
-extraction GreenvilleUtilitiesTemplateProvider
-extractionType CLASSIC
-username charterbills012
-password UrjaChart17
-outputFilename=/opt/tmp/bifrostUrjanetFile1234
-history false

 */
public class dur2bifrost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tempName = "", username="", password="", history="false";
		Map<String, String> map = new HashMap<String, String>();
		int count = 3;
		while(count --> 0)
		{
			String line1 = sc.nextLine();
			getStore(map, line1);
		}
//		System.out.println(map.size());
		for(Map.Entry<String, String> m : map.entrySet())
		{
			if(m.getKey().equals("-t"))
			{
				tempName = m.getValue();
			}
			else if (m.getKey().equals("-c")) 
			{
				StringTokenizer str = new StringTokenizer(m.getValue(), "=");
				username = str.nextToken();
				password = str.nextToken();
			}
			else if (m.getKey().equals("-h"))
			{
				history = "true";
			}
			
		}
		getPrintBifrostParm(tempName,username,password,history);
		sc.close();

	}
	
	private static void getPrintBifrostParm(String tempName, String username, String password, String history) {
		// TODO Auto-generated method stub
		System.out.println(
				"-acquisition "+tempName+"\n" + 
				"-acquisitionType CLASSIC\n" + 
				"-extraction "+tempName+"\n" + 
				"-extractionType CLASSIC\n" + 
				"-username "+username+"\n" + 
				"-password "+password+"\n" + 
				"-outputFilename=/opt/tmp/bifrostUrjanetFile1234\n" + 
				"-history "+history
				);
	}

	public static void getStore(Map<String, String> map , String line) {
		String s1 = "",s2 = "";
		StringTokenizer st = new StringTokenizer(line);
		try {
			s1 = st.nextToken();
			s2 = st.nextToken();
		}
		catch(NoSuchElementException e){
			s2 = null;
		}
//		System.out.println(s1 + "  " + s2);
		map.put(s1,s2);	
	}

}
