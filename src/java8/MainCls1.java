package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCls1 {

	public static void main(String [] maincls1) {
		RailwayPojo rp1 = new RailwayPojo("mdu", "ms", 6, 180, null);
		
		List<RailwayPojo> myList = new ArrayList<RailwayPojo>();
		myList.add(new RailwayPojo("us", "ind", 5, 500, null));
		myList.add(new RailwayPojo("aus", "uk", 3, 600, null));
		myList.add(new RailwayPojo("uk", "ind", 1, 800, null));
		
		System.out.println("My list of passengers  who has Dis of UK");
		myList.stream()
		.filter(mylist1 -> mylist1.getDst_Plt().equals("uk"))
		.forEachOrdered(mylist1 -> {
			System.out.println(mylist1.toString());
		});
		
		myList.stream()
		.forEach(mylist1 -> {
			System.out.println(mylist1.toString());
		});
		
		System.out.println(myList.parallelStream()
		.filter(a1 -> a1.getAmount() > 500)
		.count());
		
		System.out.println("Acending order");
		
		myList.stream()
		.sorted((a,b) -> a.getPlt_No() - b.getPlt_No())
		.forEach(abc -> {
			System.out.println(abc.toString());
		});
		
		System.out.println("Decending order");
		
		myList.stream()
		.sorted((a,b) -> b.getPlt_No() - a.getPlt_No())
		.forEach(abc -> {
			System.out.println(abc.toString());
		});
		
		
	}
}
