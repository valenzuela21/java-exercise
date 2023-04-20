import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploCalculateAge {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingres una fecha de nacimiento con fromato yyyy-MM-dd: ");
        String fechaStr =  scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento =  df.parse(fechaStr);
        Date actual =  new Date();

        df =  new SimpleDateFormat("yyyyMMdd");

        int desde =  Integer.parseInt(df.format(fechaNacimiento));
        int hasta =  Integer.parseInt(df.format(actual));

        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }
}
