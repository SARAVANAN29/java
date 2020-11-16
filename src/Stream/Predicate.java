package Stream;

import java.util.Arrays;

public class Predicate {

	public static void main(String[] args) {
		//filter -> inside the filter method, we should give boolean
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().filter(i -> i < 10).forEach(i ->{ System.out.println(i);});
		//map -> inside the map method we can give anything
		Arrays.asList(1,2,3,4,5,6,7,8,9,10)
			.stream()
			.map(i -> i * i)
			.filter(i -> i > 1)
			.forEach(i ->{ System.out.print(i);});

	}

}
