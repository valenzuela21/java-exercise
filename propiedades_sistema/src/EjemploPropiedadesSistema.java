import java.util.Properties;

public class EjemploPropiedadesSistema {
    public static void main(String[] args) {
        String userName =  System.getProperty("user.name");
        System.out.println("username = " + userName);

        String home =  System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace  = System.getProperty("user.dir");
        System.out.println("workspace = " +  workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineaSparator: " + lineSeparator + "Una línea nueva...");
        System.out.println("lineaSparator: " + lineSeparator2 + "Una línea nueva...");

        Properties p =  System.getProperties();
        p.list(System.out);
    }
}