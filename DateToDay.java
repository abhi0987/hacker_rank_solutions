import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by bitu on 2/6/17.
 */
public class DateToDay {

    public static void main(String args[]) throws ParseException {

        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        String total = day+"/"+month+"/"+year;
        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
        Date dt = format1.parse(total);
        DateFormat format2=new SimpleDateFormat("EEEE");
        String finalDay=format2.format(dt);

        System.out.print(finalDay.toUpperCase());
    }
}
