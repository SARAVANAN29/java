package Chumma;

import java.util.Scanner;

public class PageNumber {

//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    	Scanner sc = new Scanner(System.in);
//		int i=1;
//    	while(sc.hasNextLine()) 
//    	{
//    		String line = sc.nextLine();
//    		System.out.println(i+" "+line);
//    		i++;
//    	}
//    }
	
	
	static Scanner sc = new Scanner(System.in);
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	static boolean flag= false;
	
	static {
			if((B*H)>0 & B>0 & H>0) {
				flag = true;
			}
			else {
				System.out.println("java.lang.Exception: Breadth and height must be positive");

			}
	
	
	}
	
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}

}

