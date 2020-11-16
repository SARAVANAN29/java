package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
        String s = "He is a very very good boy, isn't he?";
        s="                                    "; 
        s=s.trim();
        
        String[] tokens = s.matches("[A-z !,?._'@]+") ? s.split("[ !,?._'@]+") : new String[0];
        System.out.println(tokens.length);
        for (String string : tokens) {
			System.out.println(string.trim());
		}
        scan.close();
    }
}


