import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {
        try{
            FileInputStream archive = new FileInputStream("./propiedades_sistema/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archive);
            p.setProperty("mi.property.person","Mi valor guardado desde un object property");
            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("ps.get(...) = " + ps.getProperty("mi.property.person"));
            System.out.println("ps.get(...) = " + System.getProperty("config.puerto.server"));
            System.out.println("ps.get(...) = " + System.getProperty("config.auto.name"));
            System.out.println("ps.get(...) = " + System.getProperty("config.auto.email"));
            //System.getProperties().list(System.out);
        }catch (FileNotFoundException e){
            System.err.println("Errror: " + e);
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
