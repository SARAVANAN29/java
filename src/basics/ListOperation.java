package basics;

import java.io.*;
import java.util.*;
/**
 * 
 * @author saravanant
 * 
5
12 0 1 78 12
2
Insert
5 23
Delete
0
 *
 */
public class ListOperation {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		String[] str = input.split(" ");
		for(String s : str)
		{
			list.add(Integer.parseInt(s));
		}
		System.out.println("*********** = " + list.size());
		int t1 = sc.nextInt();
		
		try {
			while (t1 --> 0) {
				System.out.println(t1);
				String operation = sc.next();
				if(operation.contains("Insert"))
				{
					System.out.println("Inserting Operation");
					int addIndex = sc.nextInt();
					int addElement = sc.nextInt();
					System.out.println("add index = " +  addIndex + "  add Element = " + addElement);
					list.add(addIndex , addElement);
				}
				else if(operation.contains("Delete"))
				{
					System.out.println("Deleting Operation");
					int delete = sc.nextInt();
					System.out.println("delete = " + delete);
					list.remove(delete);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println("after exception = " + list.size());
//			list.stream().forEach(i -> {System.out.print(i + " ");});
			
//			System.out.println(e);
		}
		
		sc.close();
		list.stream().forEach(i -> {System.out.print(i + " ");});
	}
}
