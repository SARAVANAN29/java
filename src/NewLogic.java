
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewLogic {

	public static void main(String[] args) throws Exception {
		String l1 = "(?<=uc.charge_amount = ).*";
		final String regex = "woot]";
		final String t_case = "/woot]";
		final Pattern p = Pattern.compile(regex);
		final Pattern p1 = Pattern.compile(t_case);
		String s="",l;
	    int i=0,j=0,fromIndex=0, toIndex=0;

		Set<String> lst=new HashSet<String>();  
		List al = new ArrayList<>();
		ListIterator listIterator = al.listIterator();
		Regx x = new Regx();
	

//		String success =x;
//		System.out.println("***************"+success);
		
		
		FileReader fr = new FileReader("/home/saravanants/Desktop/log.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while((l = br.readLine()) != null ) {
			al.add(l);
			i++;
			j++;
//			String rgx1="woot]",rgx2="/woot]";
//			String output1 = x.Regex(l, rgx1);
//			if(output1 != null){} else {fromIndex=i;}
//			String output2 = x.Regex(l, rgx2);
//			if(output2 != null){} else {toIndex=j;}

			Matcher m = p.matcher(l);
			while(m.find()) {
				if(m.start(0) == 1) {fromIndex=i;}
				}
			Matcher m1 = p1.matcher(l);
			while(m1.find()) {
				if(m1.start(0) == 1) {toIndex=j;}
				}
			}	
		System.out.println(fromIndex+"     "+toIndex);

		System.out.println("size of total lines  "+al.size());
		
		List ll = al.subList(fromIndex, toIndex);
		Set ss = new TreeSet(ll);
		Iterator list = ss.iterator();

		System.out.println("size of woot "+ll.size());
		
		while(list.hasNext())
		{
//			String sss = new String("Read Type");
//			if(list.equals(sss)) {
//				System.out.println("True");
//			}
			
			System.out.println(list.next());
			
		}
		

		
	}
}


/*
*\\[chargeGroup.*
*
*
*/
//j++;
//special test case
//Matcher m1 = p1.matcher(l);
//while(m1.find()) {
//	
//	System.out.println("**********  "+j);
//}
//

/*Iterator i = lst.iterator();
while(i.hasNext())
{
	System.out.println("\"./accountData[@accountNumber='"+i.next()+"']/..\",");

}*/
//Matcher m = p.matcher(l);
//while(m.find()) {
//	//System.out.println("Next line : "+(l+1));
//	i++;
//	s = m.group(0);
//	lst.add(s);
//	//lst.add("\"./accountData[@accountNumber='"+m.group(0)+"']/..\",");