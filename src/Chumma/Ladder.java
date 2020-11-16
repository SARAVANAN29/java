package Chumma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Results {

	/*
	 * Complete the 'solve' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 *  1. INTEGER h
	 *  2. INTEGER_ARRAY wallPoints
	 *  3. INTEGER_ARRAY lengths
	 */

	public static int solve(int h, List<Integer> wallPoints, List<Integer> lengths) {
		List<Integer> output = new ArrayList<>();

		Iterator<Integer> iterator, walliterator;
		iterator = lengths.iterator();
		walliterator = wallPoints.iterator();

		while(iterator.hasNext() & walliterator.hasNext())
		{
			int w =  walliterator.next();
//			System.out.println("w " + w );
			int t =  iterator.next();
//			System.out.println("t " +t );

			int o = (int)Math.ceil((w - (t*0.25)));
//			System.out.println("0 " + o );
			
			output.add(o);
		}
		
		int hight = Collections.max(output);
//		System.out.println(hight);
		if(hight-h  > 0)
			return hight-h;
		return 0;
	}

}

public class Ladder {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int h = Integer.parseInt(firstMultipleInput[1]);

		String[] wallPointsTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> wallPoints = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int wallPointsItem = Integer.parseInt(wallPointsTemp[i]);
			wallPoints.add(wallPointsItem);
		}

		String[] lengthsTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> lengths = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int lengthsItem = Integer.parseInt(lengthsTemp[i]);
			lengths.add(lengthsItem);
		}
		int answer = Results.solve(h, wallPoints, lengths);
		System.out.println(answer);
		//        bufferedWriter.write(String.valueOf(answer));
		//        bufferedWriter.newLine();

		bufferedReader.close();
		//        bufferedWriter.close();
	}
}
