package com.xerago;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int total=0;
        int n = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         long[] arr = new long[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Long.parseLong(arr_arr[i_arr]);
         	total += arr[i_arr];
         }

         long out_ = findMinimum(arr, total);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long findMinimum(long[] arr, int total){
        // Write code here
    	long avg = total/2, remain;
    	ArrayList list = new ArrayList<>() ;
    	for(long a : arr)
    	{
    		list.add(a);
    	}
    	long max = (long) Collections.max(list);
    	System.out.println(max);
    	
    	if(max > avg)
    	{
    		return 1;
    	}
    	else
    	{
    		remain = avg - max;
    		
    	}
    	return 0;
    }
}

//Example:
/*
5
5 3 4 1 2
output:
2
 * */
