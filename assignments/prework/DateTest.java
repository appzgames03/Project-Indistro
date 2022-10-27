//start123
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//1234567//12345678//12345678//12345678 // ramees iam a king i seee 
lyaefljhdsfsdljhgfdshgadsjhfgasdhfgsdjfhgsdkjhfgsdfgajsdhfg
;kjsdh;kjshdlkjahdfgsdfdshSGXf
public class DateTest {
	public static void main(String[] args) {
		// return (String) result.getRow(0).getColumn("max").getValue().toString();

		// SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		// Date date = null;//456
		// try {
		// date = dt.parse(gasFlowDate);
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		// SimpleDateFormat dt1 = new SimpleDateFormat("MM/dd/yyyy");
		// return dt1.format(date);
		//yo yo yo yo
		// //return gasFlowDate_returned;
		//23456789 i
		
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
		System.out.println("--------");

		Date date_3 = null;
		Date date=null;
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

}//end1
