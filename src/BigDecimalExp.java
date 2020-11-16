import java.math.BigDecimal;
import java.util.*;
public class BigDecimalExp{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2]; // n+2 makes last 2 elements as null. So it will throw null pointer exception. So that we are creating a new array.
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        String newArray[] = new String[n];
        for(int i= 0;i < newArray.length; i++)
            {
            newArray[i] = s[i];
        }
        
       Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
    	    @Override
            public int compare(String a1, String a2){
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));
       
//       s = newArray;
       //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}