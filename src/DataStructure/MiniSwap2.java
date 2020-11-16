package DataStructure;

import java.io.IOException;

public class MiniSwap2 {

	// Complete the minimumSwaps function below.
	/*static int minimumSwaps(int[] arr) {
    	int swap = 0;
    	int firstElement = Integer.MAX_VALUE;
		int secElement = Integer.MAX_VALUE;
    	for(int i=0; i<arr.length-2; i++) {
    		int test = i+1;
    		firstElement = i;
    		secElement = i+1;
    		if(arr[firstElement] < arr[secElement])
    		{

    		}
    		else {
				swap(arr, firstElement, secElement);
			}
    		print(arr);
    	}

    	return swap;
    }*/

	static int minimumSwaps(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			while(arr[i] != i+1) {
				int temp = arr[i];
				arr[i] = arr[temp-1];
				arr[temp-1] = temp;
				count++;
			}
		}
		return count;
	}

	public static void swap(int[] arr, int position1, int position2)
	{
		int temp = arr[position1];
		arr[position1] = arr[position2];
		arr[position2] = temp;
	}

	public static void print(int[] arr)
	{
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
		System.out.println();
	}
	//    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		/* int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }*/
		int[] arr = {7, 1, 3, 2, 4, 5, 6};
		int res = minimumSwaps(arr);
		System.out.println(res);
		//        bufferedWriter.write(String.valueOf(res));
		//        bufferedWriter.newLine();

		//        bufferedW/riter.close();

		//        scanner.close();
	}
}
