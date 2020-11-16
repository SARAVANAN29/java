package Chumma;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;

class Add{
	
    int add(int a,int b){
    	int c = a+b;
    System.out.println(a+"+"+b+"="+ c);
    return a+b;
    }
    int add(int a,int b,int c){
    System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
    return a+b+c;
    }
    int add(int a,int b,int c,int d){
    System.out.println(a+"+"+b+"+"+c+"+"+d+"="+(a+b+c+d));
    return a+b+c+d;
    }
    int add(int a,int b,int c,int d,int e){
    System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"="+(a+b+c+d+e));
    return a+b+c+d+e;
    }
    int add(int a,int b,int c,int d,int e, int f){
    System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"+"+f+"="+(a+b+c+d+e+f));
    return a+b+c+d+e+f;
    }
	
}


public class Varargs {

    public static void main(String[] args) {
       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			
			
			Method[] methods=Add.class.getDeclaredMethods();
			HashSet<String> set=new HashSet<String>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	

}

