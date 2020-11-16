package java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map$ {

	public static void main(String a[]){
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "s");
		m.put(2, "a");
		m.put(null, "r"); //Unless it's a TreeMap we can able to set null in Key in the Map. In TreeMap it throws null pointer Exception
//		m.put(null, "a");
		
//		for(Entry<Integer, String> ms : m.entrySet()) {
//			System.out.println(ms.getKey() + " "+ ms.getValue());
//		}
//		
//		System.out.println(m);
//		
//		m.forEach((k,v) -> 
//			System.out.println( k     +" "+    v)
//		);
		m.entrySet().stream().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));
		
		
		Iterator<Map.Entry<Integer, String>> it = m.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String > mm = it.next();
			System.err.println(mm.getKey()+"  "+mm.getValue());
		}
}
}