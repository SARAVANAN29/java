package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import Chumma.Set;

public class CandidateCode {
	private static final Scanner scanner = new Scanner(System.in);
	private static int winCount=0;
    public static void main(String[] args) throws IOException {
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("n = "+n);
        
        for (int i = 0; i < n; i++) {
        	
        	int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.println("t = "+t);
            
            String[] villan = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            String[] power = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            String output = getResult(villan,power);
            System.out.println(output);
        }
        System.out.println();

//        bufferedWriter.write(String.valueOf(result));
//        in.newLine();
        scanner.close();
//        in.close();

    }

	private static String getResult(String[] villan, String[] power) {
		TreeSet<Integer> vSet = new TreeSet<>();
		TreeSet<Integer> pSet = new TreeSet<>();
		
		for(String v: villan)
		{
			vSet.add(Integer.parseInt(v));
//			System.out.println(v);
		}
		
		for(String p: power)
		{
			pSet.add(Integer.parseInt(p));
			System.out.println(p);
		}

		Integer[] a = vSet.toArray(new Integer[villan.length]);
		Integer[] b=pSet.toArray(new Integer[power.length]);
		
		for(int d = 0; d < power.length; d++)
		{
			if(a[d] < b[d]) {
				winCount++;
			}
			System.out.println("win count = "+winCount);
		}
		winCount =0;
		if(winCount == power.length)
			{return "WIN";}
		else {return "LOSE";}
	}
}

//test code
//1
//6
//112 243 512 343 90 478 
//500 789 234 400 452 150