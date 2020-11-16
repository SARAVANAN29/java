import java.util.*;
import java.io.*;



class DataType{
    public static void main(String []argh)
    {
//    	System.out.println("short : "+Short.MIN_VALUE+" , "+Short.MAX_VALUE+ "  "+ Short.SIZE);
//    	System.out.println("int : "+Integer.MIN_VALUE+" , "+Integer.MAX_VALUE+ "  "+ Integer.SIZE);
//    	System.out.println("long : "+Long.MIN_VALUE+" , "+Long.MAX_VALUE+ "  "+ Long.SIZE);
//    	System.out.println("byte : "+Byte.MIN_VALUE+" , "+Byte.MAX_VALUE+ "  "+ Byte.SIZE);



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        System.out.println(Math.min(-1000000000, -2147483648));
        
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)System.out.println("* long");}
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

//expected output
/**
 * -150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
 */


