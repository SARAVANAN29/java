import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Log {
	
	private static Logger log = null;

	
	public static void main(String[] loggerCheck)
	{
		log = LoggerFactory.getLogger(Log.class);
	}
}
