package Chumma;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicArr {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    	ArrayList<Integer> list = new ArrayList<>();
    	Set<Integer> missedSet = new LinkedHashSet<>();
    	Set<Integer> duplicateSet = new LinkedHashSet<>();
//    	Map map = new LinkedHashMap<>();
//    	boolean isDuplicate = false;
    	for(int i=0; i<s.length; i++)
    	{
    		for(int j=0; j<s.length; j++)
    		{
    			list.add(s[i][j]);
    		}
    	}
    	
    	for(int i=1; i<10; i++)
    	{	
    		boolean isPresent = list.contains(i);
//    		System.out.println(list.contains(i));
    		if(!isPresent)
    		{
    			System.out.println("missed : " + i);
    			missedSet.add(i);
    		}
    		
    		if(list.indexOf(i) != list.lastIndexOf(i))
    		{
    			System.out.println("duplicate : " + i);
    			duplicateSet.add(i);
    		}
    	}
    	
    	return getInt(missedSet , duplicateSet);
//    	return total;
    }
    
    private static int getInt(Set<Integer> missedSet, Set<Integer> duplicateSet) {
		int total = 0;
		Iterator<Integer> i = duplicateSet.iterator();
		Iterator<Integer> j = missedSet.iterator();
		System.out.println(missedSet.size() + " " + duplicateSet.size());
    	while(i.hasNext() && j.hasNext()) {
    		total += Math.abs(i.next() - j.next());
		}
    	return total;
	}
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}

//7 6 5 - 18
//7 2 8 - 17
//5 3 4 - 12
//Ans : 18
