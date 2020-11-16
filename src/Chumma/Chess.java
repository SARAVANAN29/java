package Chumma;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Chess {
	static int temp;

    // Complete the solve function below.
    static String solve(List<List<Integer>> board) {
    	String output = "no_output_yet";
    	List<Integer> myList = new ArrayList<>();
    	Iterator iterator = board.listIterator();
    	while (iterator.hasNext()) {
			List<Integer> type = (List<Integer>)iterator.next();
			System.out.println("\n"+ "type" + type);
			Iterator<Integer> sIterator = type.listIterator();
			while (sIterator.hasNext()) {
				Integer type2 = (Integer) sIterator.next();
				System.out.println(type2);
				myList.add(type2);
			}
		}
    	
    	Iterator<Integer> it = myList.iterator();
    	while (it.hasNext()) {
//			it.next().compare(temp, it.)
			
		}
    	
    	return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> board = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] boardRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> boardRowItems = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    int boardItem = Integer.parseInt(boardRowTempItems[j]);
                    boardRowItems.add(boardItem);
                }

                board.add(boardRowItems);
            }

            String result = solve(board);
            System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
