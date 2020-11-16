package Chumma;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrMap {

	public static void main(String []  mapping)
	{
		Scanner scanner = new Scanner(System.in);
		int[] a = {5,6,4,2,1};
		Map<Integer , Integer > myArr = new HashMap<>();
		for(int i=0; i < a.length; i++)
		{
			myArr.put(i, a[i]);
		}
		
		System.out.println("Enter a number = ");
		int no = scanner.nextInt();
		
		print(myArr, no);
	}
	static void print(Map<Integer, Integer> myArr, int no){
//		for(Map.Entry<Integer, Integer> m : myArr.entrySet())
//		{
//			System.out.println(m.getKey() + " : "+ m.getValue());
//		}
		System.out.println("key" + " = " + "value");
		myArr.entrySet().stream().forEach(a -> {System.out.println(a.getKey() + " = " + a.getValue());});
		
		myArr.entrySet().stream().filter(a -> a.getValue() == no).forEach(o -> System.out.println(o.getKey() + "***" + o.getValue()));

	}	
}
