import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class App {

    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd HH:MM:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        SimpleDateFormat simpleDateFormat1 =
                new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        simpleDateFormat1.setTimeZone(timeZone);

        System.out.println("Time zone: " + timeZone.getID());
        System.out.println("default time zone: " + TimeZone.getDefault().getID());
        System.out.println();

        System.out.println("UTC:     " + simpleDateFormat1.format(calendar.getTime()));
        System.out.println("Default: " + calendar.getTime());

    }
}

class Test {
    public static int i;
}