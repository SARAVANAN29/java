package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Map1 {
	public static void main(String [] m){
		List<Integer> list = Arrays.asList(8,5,2,3,4,5);
		
		
		System.out.println(list.stream());
//		Collections.sort(list, () -> );
		list.forEach(System.out::print);
	}
}