import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsTest/* implements Map<in, V> */  extends Thread{
	static int a;
	int b;
	public static void main(String [] sr) {
//		List list = Arrays.asList(1,2,3,4,5,6);
		List list = new LinkedList<>();
//		ClassLoader thread = new Thread().currentThread();
//		System.out.println(thread);
//		list.r
//		System.out.println(list.get(0));
		for(Method method:List.class.getMethods()) {
			System.out.println(method);
		}
		Set<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		for(int ss : s)
		{
			System.out.println(ss);
		}
		System.out.println("ar " + s.size());

		s.remove(2);
		System.out.println("br " + s.size());
	}

	
	Thread t = new Thread();
//	t.start();
	
	
}
