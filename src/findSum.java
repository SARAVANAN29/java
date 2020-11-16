import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class findSum {
	
	public static void main(String[] sara) {
		int[] arr = {17,11,25,-5,23,12,56,81, 8};
		int sum = 20;
		int skip =0;
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int a : arr)
		{
			if(sum > a && a != skip)
			{
				int temp = sum - a;
				for(int a1 : arr)
				{
					if(a1 == temp)
					{
						set.add(temp);
						set.add(a);
//						System.out.println(temp + "  " + a);
					}
				}
			}
		}
		
//		Iterator iterator  =set.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		set.stream().forEach(output -> System.out.println(output));
		
	}
}
