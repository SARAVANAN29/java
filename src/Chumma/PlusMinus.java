package Chumma;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int pos = 0, neg = 0, zero = 0;
    	float len = arr.length;
    	for(int a : arr)
    	{
    		if(a > 0){
    			pos ++;
    		}
    		else if (a == 0) {
				zero++; 
			}
    		else if (a < 0) {
				neg++;
			}
    	}
    	System.out.println(pos/len);
    	System.out.println(neg/len);
    	System.out.println(zero/len);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
