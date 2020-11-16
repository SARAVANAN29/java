package Chumma;

import java.util.Scanner;

class Problem1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            getOutput(a,b,n);
        }
        in.close();
    }

	private static void getOutput(int a, int b, int n) {
		for(int i=1,x=1; i<=n; i++,x=x+x+1) {
			int output = a + b * x;
			System.out.print(output);
			System.out.print(" ");
		}
		System.out.println();
	}
}

