
//public class ANDOper {
//
//	public static void main(String [] andOp)
//	{
//		int a = 7;
//		int b = 4;
//		System.out.println(a & b );
//	}
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int Q = Integer.parseInt(arr[1]);
		String[] arr_Arr = br.readLine().split(" ");
		int[] Arr = new int[N];
		for(int i_Arr=0; i_Arr<arr_Arr.length; i_Arr++)
		{
			Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
		}
		int[] L = new int[Q];
		int[] R = new int[Q];
		int[] Val = new int[Q];
		for(int i_L=0; i_L<Q; i_L++)
		{
			String[] temp = br.readLine().split(" ");
			L[i_L] = Integer.parseInt(temp[0]);
			R[i_L] = Integer.parseInt(temp[1]);
			Val[i_L] = Integer.parseInt(temp[2]);

		}
		int[] out_ = AND_Queries(Arr, Val, L, N, Q, R);
		System.out.print(out_[0]);
		for(int i_out_=1; i_out_<out_.length; i_out_++)
		{
			System.out.print(" " + out_[i_out_]);
		}
		wr.close();
		br.close();
	}
	static int[] AND_Queries(int[] Arr, int[] Val, int[] L, int N, int Q, int[] R){
		for(int i=0; i<Q; i++) {
			for(int r=L[i]-1; r<R[i]; r++)
			{
				Arr[r] = Arr[r] & Val[i];
////				Stream.builder().build().filter(Arr[r] = Arr[r] & Val[i]);
//				int [] Arra = Arrays.stream(Arr).forEach(action);
			
			}
		}
//		Arrays.stream(Arr).
//		IntStream.range(0, Q)
//			.parallel()
//			.forEachOrdered(i -> 
//			{
//				IntStream.range(L[i]-1, R[i])
//				.parallel()
//				.forEachOrdered(
//						r -> Arr[r] = Arr[r] & Val[i]
//				);
//				
//			}
//			);
		for(int i=0; i<Q; i++) {
			List<Integer> list = new ArrayList<>();
//			Stream.
		}
		
		return Arr;
	}
}

