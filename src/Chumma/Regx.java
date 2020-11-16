package Chumma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {

	static String getRegex(String Context, String rgx){
		Pattern p = Pattern.compile(rgx);
		Matcher m = p.matcher(Context);
		String Oprgx = null;
		while(m.find()) {
			Oprgx = m.group();
//			if(m.start(0) == 0) {
//				System.out.println(true);
//			};
//			if(m.start(0) == 0) {Oprgx=m.group(0);}
		}
		return Oprgx;
		}
	
	
	static int getRegexCount(String Context, String rgx){

		Pattern p = Pattern.compile(rgx);
		Matcher m = p.matcher(Context);

		int count = 0;
		while(m.find()) {
			count++;
		}
		return count;
		}
		
//	int Regex(String Context, String rgx, int i, int j) {
//		this.getRegex(Context, rgx);
//		return i+j;
//	}
	}


