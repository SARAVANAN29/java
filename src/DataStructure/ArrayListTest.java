package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;
/***
 * 
 * @author saravanant
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
 */
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>[] arrLists = new ArrayList[n];
		for(int i=0; i<n; i++) {
			int s = sc.nextInt();
			arrLists[i] = new ArrayList<>();
			while (s --> 0) {
				try {
				int x = sc.nextInt();
				arrLists[i].add(x);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		int checkCount = sc.nextInt();
		while (checkCount --> 0) {
			try {
				int a = sc.nextInt()-1, b=sc.nextInt()-1;
				System.out.println(arrLists[a].get(b));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR!");
			}
		}
		sc.close();
	}

}
