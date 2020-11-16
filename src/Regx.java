import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {

	public static String getRegex(String Context, String rgx){
		//System.out.println("yeah i got");
		//System.out.println(Context+"         regex "+rgx);
		Pattern p = Pattern.compile(rgx);
		Matcher m = p.matcher(Context);
		String Oprgx = null;
		while(m.find()) {
			
			if(m.start(0) == 1) {Oprgx=m.group(0);}
		}
		return Oprgx;
		}
		
	int Regex(String Context, String rgx, int i, int j) {
		this.getRegex(Context, rgx);
		return i+j;
	}
	}


