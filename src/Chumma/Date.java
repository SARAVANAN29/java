package Chumma;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */
class Result{
        public static String findDay(int month, int day, int year) {
        	String findDay= month+"/"+day+"/"+year;
        	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        	java.util.Date date = null;
			try {
				date = sdf.parse(findDay);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	DateFormat dFormat = new SimpleDateFormat("EEEE");
        	String output = dFormat.format(date);
        	
//        	Calendar c = Calendar.get
//        	sdf.format(date);
//        	sdf.setCalendar(Calendar.DAY_OF_WEEK);
         	return output.toUpperCase();
        }
}
    public class Date {
        public static void main(String[] args) throws Exception {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            int month = Integer.parseInt(firstMultipleInput[0]);
//
//            int day = Integer.parseInt(firstMultipleInput[1]);
//
//            int year = Integer.parseInt(firstMultipleInput[2]);
//
//            String res = Result.findDay(month, day, year);
//
//            bufferedWriter.write(res);
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
        	print();
        }
        
        public static void print() throws Exception {
        	String bill_date = "2019-12-30";
        	DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
        	DateFormat targetFormat = new SimpleDateFormat("MM/dd/yyyy");
        	java.util.Date date = originalFormat.parse(bill_date);
        	String date1 = targetFormat.format(date);
			System.out.println(date1);
        }
    }
