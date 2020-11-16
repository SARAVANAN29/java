package DataStructure;

import java.util.Scanner;

public class CopyCat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr=new int[n];
	    int res=0;
	    for (int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	        int s=arr[i];
	        if (s<0) res++;
	        for (int j=i-1; j>=0; j--){
	        	System.out.println("res = "+ res);
	        	System.out.println("arr["+j+"] = " + arr[j]);
	        	System.out.println("s = " +s);
	            s+=arr[j];
	            if (s<0) res++;
	        }
	        System.out.println("-------------------------------------");
	        System.out.println("res = "+ res );
	    }
	    System.out.println(res);
	    System.out.println("--------------------------------");
	    sc.close();
	}

}
