package Lamda;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer stringTokenizer = new StringTokenizer("5,3" , ",");
		System.out.println(stringTokenizer.countTokens());
		int t = stringTokenizer.countTokens();
		while(t --> 0)
		{
			System.out.println(stringTokenizer.nextToken());
		}

	}

}
