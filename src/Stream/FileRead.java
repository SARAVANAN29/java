package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileRead {
	public static void main(String... a) {
		Stream<String> lines = null;
		
		try {
			lines = Files.lines(Paths.get("/home/saravanant/Desktop/myCode.txt"));
			lines.forEach(i -> {
				System.out.println(i);
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
