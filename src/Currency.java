//import java.util.*;
//import java.text.*;
//
//public class Currency {
//    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//        
//        Locale in = new Locale("en", "IN");
//        NumberFormat us = NumberFormat.getCurrencyInstance(in);
//        NumberFormat india = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//        
//        
//        
//        // Write your code here.
//        
//        System.out.println("US: " + us.format(payment));
//        System.out.println("India: " + india.format(payment));
//        System.out.println("China: " + china.format(payment));
//        System.out.println("France: " + france.format(payment));
//    }
//}
//

import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] t = s.trim().split("\\S+|[ !,?.\\_'@]+|\\W+| ");
        System.out.println(t.length);
        for(String Ss : t)
        {
        	System.out.println(Ss);
        }
        scan.close();
    }
}


