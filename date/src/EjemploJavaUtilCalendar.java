import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //calendar.set(2020, Calendar.APRIL, 25, 19, 20, 10);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        //calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.MINUTE, 23);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);
        Date fecha = calendar.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = format.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);
    }





}
