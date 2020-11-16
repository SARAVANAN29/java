package Chumma;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testCase = "Transaction Date,Type,Description,Amount\n" + 
				"8/20/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($77.40)\n" + 
				"8/20/2019,Payment,\"PAYMENT RECEIPT, ECHECK\",$77.40\n" + 
				"8/6/2019,Bill,Bill due on 2019-08-28,$24.78\n" + 
				"8/1/2019,Bill,Bill due on 2019-08-23,$77.40\n" + 
				"7/25/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($29.25)\n" + 
				"7/25/2019,Payment,\"PAYMENT RECEIPT, ECHECK\",$29.25\n" + 
				"7/5/2019,Bill,Bill due on 2019-07-29,$29.25\n" + 
				"6/25/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($34.71)\n" + 
				"6/25/2019,Payment,\"PAYMENT RECEIPT, ECHECK\",$34.71\n" + 
				"6/5/2019,Bill,Bill due on 2019-06-27,$34.71\n" + 
				"5/24/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($42.36)\n" + 
				"5/24/2019,Payment,\"PAYMENT RECEIPT, ECHECK\",$42.36\n" + 
				"5/6/2019,Bill,Bill due on 2019-05-29,$42.36\n" + 
				"4/25/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($82.77)\n" + 
				"4/25/2019,Payment,\"PAYMENT RECEIPT, ECHECK\",$82.77\n" + 
				"4/4/2019,Bill,Bill due on 2019-04-29,$82.77\n" + 
				"3/26/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($104.97)\n" + 
				"3/26/2019,Payment,\"PAYMENT RECEIPT, ECHECK\",$104.97\n" + 
				"3/6/2019,Bill,Bill due on 2019-03-28,$104.97\n" + 
				"2/26/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($134.89)\n" + 
				"2/5/2019,Bill,Bill due on 2019-02-27,$134.89\n" + 
				"1/25/2019,Payment,ONLINE PAYMENT WITHDRAWAL,($135.32)\n" + 
				"1/7/2019,Bill,Bill due on 2019-01-29,$135.32\n" + 
				"12/27/2018,Payment,ONLINE PAYMENT WITHDRAWAL,($89.98)\n" + 
				"12/4/2018,Bill,Bill due on 2018-12-28,$89.98\n" + 
				"11/21/2018,Payment,ONLINE PAYMENT WITHDRAWAL,($63.26)\n" + 
				"11/1/2018,Bill,Bill due on 2018-11-27,$63.26\n" + 
				"10/23/2018,Payment,ONLINE PAYMENT WITHDRAWAL,($32.22)\n" + 
				"10/3/2018,Bill,Bill due on 2018-10-25,$32.22\n" + 
				"9/7/2018,Payment,\"PAYMENT,BILLMATRIX CR/DB/ACH NO CHARGE\",($36.02)\n" + 
				"9/4/2018,Bill,Bill due on 2018-09-26,$36.02";
		
		String newBody = "<html><body>";
		String[] lines = testCase.split("\\r?\\n");
		System.out.println("count of lines  = " + lines.length);
		
		for(String line : lines)
		{
			System.out.println("current line : " + line);
			String date = "", newDate = "";
			Pattern pattern = Pattern.compile("\\d+\\/\\d+\\/\\d{2,4}");
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				date = matcher.group();
				System.out.println("regex date " + date);
				SimpleDateFormat originalFormat = new SimpleDateFormat("MM/dd/yyyy");
				SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy-dd-MM"); //2018-09-04
	        	Date date2 = null;
				try {
					date2 = originalFormat.parse(date);
					System.out.println("date :"+ date2);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				newDate = targetFormat.format(date2);
			}
        	System.out.println("new date : " + newDate);
			System.out.println(" line  " + line );
			
			newBody = newBody.concat("<a id="+line+" , url=https://myaccount.columbiagaspa.com/bills/"+newDate+">"+line+"</a>");
		}
		newBody = newBody.concat("</body></html>");

	}

}
