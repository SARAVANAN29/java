package basics;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {
		// Write your code here
		return grades.stream().map(i -> getPrint(i)).collect(Collectors.toList());
	}

	public static int getPrint(int i)
	{
		if(i < 38) {
			return i;
		}
		else if (i >= 38) {
			int t = i%5;
			if(t >= 3)
			{
				return i+5-t;
			}
			else {
				return i;
			}
		}
		else {
			return i;
		}
	}
}

public class ResultMain {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		})
				.map(String::trim)
				.map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = Result.gradingStudents(grades);

		//        bufferedWriter.write(
		System.out.println(result.stream()
				.map(Object::toString)
				.collect(joining("\n")));
		//            + "\n"
		//        );

		bufferedReader.close();
		//        bufferedWriter.close();
	}
}
