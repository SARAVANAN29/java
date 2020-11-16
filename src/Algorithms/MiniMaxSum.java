package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MiniMaxSum {
	
	static void trial() {
		Integer aInteger = 25; //Autoboxing ; Here int converting into Integer
		int a = aInteger; //Unboxing ; Here object convering into int
    	System.out.println("Integer" + aInteger.intValue());
	}
	
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long total = 0;
    	ArrayList<Long> list = new ArrayList<>();
    	for(int i=0; i<arr.length; i++)
    	{
    		total += arr[i];
    	}
    	for(int i=0; i<arr.length; i++)
    	{
    		list.add(total-arr[i]);
    	}
    	
    	System.out.println(Collections.min(list) + " " + Collections.max(list));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

//        miniMaxSum(arr);
        trial();

        scanner.close();
    }
}
