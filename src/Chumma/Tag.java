package Chumma;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.ess.regexutil.regexparser.RegexConfig;

//08:28:47
public class Tag {
	/*public static void main(String[] args) {

		// \<(?!\/).*\>
		// \<\/.*\>
		Pattern startTag = Pattern.compile("(?<=\\<(?!\\/)).*(?=\\>)");
		Pattern endTag = Pattern.compile("(?<=\\<\\/).*(?=\\>)");
//		Matcher matcher = null;
//		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
		for(String line : args) {
//		while (testCases > 0) {
//			String line = in.nextLine();
			String end = Regx.getRegex(line, "(?<=\\<(?!\\/)).*(?<=\\>)");
			String st = Regx.getRegex(line, "(?<=\\<(?!\\/)).*(?<=\\>)");
			int stCount = Regx.getRegexCount(line, "(?<=\\<(?!\\/)).*(?<=\\>)");
			System.out.println(st);

//			testCases--;
//		}
		}
	}*/
	
	
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        
        while (testCases-- > 0) {
            String line = scan.nextLine();
            
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
        scan.close();
    }
}

/*
 * sample input 4 <h1>Nayeem loves counseling</h1> <h1><h1>Sanjay has no
 * watch</h1></h1><par>So wait for a while</par> <Amee>safat codes like a
 * ninja</amee> <SA premium>Imtiaz has a secret crush</SA premium>
 */
