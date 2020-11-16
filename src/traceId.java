
import java.util.Scanner;

public class traceId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testCase = "17227bf924cdb996,19f70b1dc6d3f319,258983513f1163f3,298270c2bb8007b2,359b39c933c56e05,426b311df18b929a,5010ba4706d6e5e5,739255cfc14cef5f,9fa5ffde3c7ec12c,b0ab6a1e998daeaa,b1fa8b429539c672,b50b7e9f44a10c63,b9c14fd790dd2df3,b9e4a930712fddfc,c77cd25be253b78f,c882eff4522ec7a6,f0b70ab71f503ca0\n"; 
		Scanner scanner = new Scanner(System.in);
		String traceId = scanner.next();
		String output = "";
//		String traceId = testCase;
		String[] traceIds = traceId.split(",");
		int count = traceIds.length;
		for(String string : traceIds)
		{
			output += "traceId==" + string;
			if(count != 1 )
			{
				output += " or ";
			}
			count--;
		}
		System.out.println(output);
	}

}
