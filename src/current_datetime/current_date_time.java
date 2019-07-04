package current_datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class current_date_time {

    public static void main(String[] args) {

      /*  //"hh" in pattern is for 12 hour time format and "aa" is for AM/PM
        SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
        //Setting the time zone
        dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(dateTimeInGMT.format(new Date()));*/

        //Displaying current time in 12 hour format with AM/PM
        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String dateString = dateFormat.format(new Date()).toString();
        System.out.println("Current time in AM/PM: "+dateString);

        //Displaying current date and time in 12 hour format with AM/PM
        DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
        String dateString2 = dateFormat2.format(new Date()).toString();
        System.out.println("Current date and time in AM/PM: "+dateString2);

    }
}
