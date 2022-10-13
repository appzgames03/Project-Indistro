import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// return (String) result.getRow(0).getColumn("max").getValue().toString();

		// SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		// Date date = null;
		// try {
		// date = dt.parse(gasFlowDate);
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		// SimpleDateFormat dt1 = new SimpleDateFormat("MM/dd/yyyy");
		// return dt1.format(date);
		//
		// //return gasFlowDate_returned;
		
		
		Date date_1 = new Date();
		System.out.println(date_1);
		system.out.println("10/04/1999");
		SimpleDateFormat dt1 = new SimpleDateFormat("MM/dd/yyyy");
		String date_str1 = dt1.format(date_1);
		System.out.println(date_str1);

		Date date_2 = new Date();
		SimpleDateFormat dt2 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String date_str2 = dt2.format(date_2);
		System.out.println(date_str2);

		Date date_3 = null;
		try {
			date_3 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(date_str2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(date_3+"date");
		SimpleDateFormat dt3 = new SimpleDateFormat("MM/dd/yyyy");
		String date_str3 = dt3.format(date_3);
		System.out.println(date_str3);
	}

}
