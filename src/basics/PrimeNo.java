package basics;

import java.math.BigInteger;

public class PrimeNo {

	public static void main(String[] args) {
		int t = 157;

		System.out.println(BigInteger.valueOf(t).isProbablePrime(t));
		
		int m = t/2;
		boolean isPrime = false;
		if(m == 0 | m == 1)
		{
			isPrime = true;
		}
		else {
			for(int i=2; i<=m; i++)
			{
				if(t%i == 0)
				{
					System.out.println(i);
					isPrime = true;
					break;
				}
			}		}

		if(!isPrime)
		{
			System.out.println("Yes prime no");
		}
	}

}
