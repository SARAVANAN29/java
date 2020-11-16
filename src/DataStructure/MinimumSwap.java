package DataStructure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinimumSwap{

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int copy[] = arr.clone();
    	int count = 0;
    	Arrays.sort(copy);
    	for(int i=0; i<arr.length/2; i++)
    	{
    		if(copy[i] != arr[i])
    		{
    			Swap(arr, findPosition(copy[i], arr, i), i);
    			count++;
    			
    		}
    	}
//    	IntStream.range(0, arr.length)
//    		.filter(i -> copy[i] != arr[i])
//    		.filter(i -> findPosition(copy[i], arr))
//    		.forEach(() -> {Swap(arr, i, j);});
    	
    	return count;

    }
    
    static int findPosition(int toFind, int[] arr, int currentPosition) {
    	return IntStream.range(currentPosition, arr.length)
    			.filter(i -> toFind == arr[i])
    			.findFirst()
    			.getAsInt();
    }
    
    static void Swap(int[] arr,int i, int j)
    {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, Exception {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        System.out.println(res);
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

