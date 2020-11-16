import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        toRotate(a,d);
        scanner.close();
    }

	public static void toRotate(int[] a, int d) {
		int length = a.length;
		int [] a1 = Arrays.copyOfRange(a, d, a.length);
		int [] b = Arrays.copyOfRange(a, 0, d);
		
//		for(int i = d-1; i>=0; i-- )
//		{
//			for(int m=0; m<length-1; m++)
//			{
//				System.out.println("a[m] = "+ a[m] + " a[m+1] = "+ a[m+1]);
//				int temp = a[m];
//				a[m] = a[m+1];
//				a[m+1] = temp;
//			}
//		}
		for(int t : a1)
			{
				System.out.print(t + " ");
			}
		for(int t : b)
			{
				System.out.print(t + " ");
			}
//		return a;
	}
}
