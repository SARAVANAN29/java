package Algorithms;

import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.
	static void staircase(int n) {
		int temp=1;
		for(int i=n; i>0; i--)
		{ 
			
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
				
			}
			for(int t=0; t<temp; t++)
			{
				System.out.print("#");
			}
			System.out.println();
			temp++;
		}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

