package Stream;

import java.io.IOException;
import java.util.stream.IntStream;

public class IntStrm {

	public static void main(String[] args) throws IOException {
//		int max = (int) IntStream
		//Integer Stream
		IntStream
			.range(1 , 100)
			.forEach(System.out::print);
//			.count();
//		1234567891011121314
//		System.out.println(max);
		
		IntStream
		.range(1 , 15)
		.skip(16)
		.forEach(System.out::print);
	}

}
