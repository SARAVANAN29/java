import java.util.HashMap;
import java.util.Map;

public class MissingNo{
	public static void main(String [] viki)
	{
		int arr[] = {9,2,3,5,6,7,8};
//		Arrays.sort(arr);
//		for(int i=1; i<=10; i++)
//		{
//			int a = Arrays.binarySearch(arr, i);
//			if(a < 0)
//			{
//				System.out.println(i);
//			}
//			
//		}
//		Set<Integer> list = new HashSet<>();
		for (int i = 1; i <= 10; i++) {
			int num = 0;
			for(int no : arr)
			{
				if(no == i);
				else {
					num++;
				}
			}
			
			if(num == arr.length)
			{
				System.out.println(i);
			}
		}

//		list.iterator().forEachRemaining(a -> System.out.println(a) );
		
		
//		Map<Integer, Boolean> map = new HashMap<>();
//		for (int i = 1; i <= 10; i++) {
//			map.put(i, false);
//		}
//		for(int a : arr)
//		{
//			map.put(a, true);
//		}
//		map.entrySet().forEach(l -> {
//			if(!l.getValue()) {System.out.println(l.getKey());}
//				});
	}
}
