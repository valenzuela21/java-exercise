import java.util.Arrays;
import java.util.Collections;

public class EjemplosArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total/2; i++){
            String actual = arreglo[i];
            String inverso =  arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
        }
    }

    public static void main(String[] args) {
        String[] productos = {
                "Kingston Pendrive 64GB",
                "Smasung Galaxy",
                "Discuro Duro SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Bicicle Oxford"
        };

        int total = productos.length;
        Arrays.sort(productos);
        System.out.println("==================== Usando for ========================");
        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i] );
        }

        System.out.println("==================== Modificando el arreglo ========================");
        //arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos));

        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i] );
        }

    }
}
