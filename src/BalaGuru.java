/*public class BalaGuru {

	public static void main(String[] args) {
		String s = "3ab11c(ef)";
		String s1 = s.replaceAll("\\d+", " ");
		String[] s2 = s1.split(" ");
		char[] a = s.toCharArray();
		int i=0,j=0;
		for(char a1 : a)
		{
			if(57>=a1 & a1>48)
			{
				i++;
				String limit =String.valueOf(a1);
				for(int x=0; x<s2.length; x++ )
				{
					if(x==i) {
					for(int k=0; k<Integer.parseInt(limit); k++) {
						System.out.print(s2[x]+" ");
					}
					}
				}
				
			}
			}
		}
		}
*/
public class BalaGuru {
//	Test(){
//		
//	}
	public static void main() {
		Integer i = new Integer(100);
		System.out.println(i);
	}
}
