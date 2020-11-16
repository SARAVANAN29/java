package basics;

//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneDirectorySearch{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			map.put(name, phone);

		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			Object val = map.get(s);
			if(val != null)
			{
				System.out.println(s+"="+(Integer)map.get(s));
			}
			else {
				System.out.println("Not found");
			}
		}
	}
}




