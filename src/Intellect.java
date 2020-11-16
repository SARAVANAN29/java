import java.util.HashSet;
import java.util.Set;

public class Intellect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"s","a","r","a","v","a","n","a","n"};
		Set<String> set = new HashSet<>();
		for(String s : str)
		{
			if(!set.add(s))
			{
				System.out.println(s);
			}
		}
		
		System.out.println("****");
		set.forEach(a -> System.out.println(a));
	}

}
