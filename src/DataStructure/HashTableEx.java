package DataStructure;

import java.util.HashMap;
import java.util.Scanner;

public class HashTableEx {
	HashMap<Integer, String> map;
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
    	if(magazine.length > note.length)
    	{
	    		for(String string : note)
	    		{
	    			System.out.println( string + " = " + string.hashCode());
	    		}
	    		System.out.println();
	    		for(String str : magazine)
	    		{
	    			System.out.println( str + " = " + str.hashCode());
	    		}
    	}
    	else {
			
		}
    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
