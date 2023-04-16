import java.util.Arrays;

public class EjemploforArreglosInverso {

    public static void main(String[] args) {
        String[] productos =  new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive  64Gb";
        productos[1] = "Sansumg Galaxy";
        productos[2] = "Maleta totto";
        productos[3] = "Biclite ELectrica Oxford";
        productos[4] = "Mackbook Pro";
        productos[5] = "Tv LG";
        productos[6] = "Asus Notebook";
        Arrays.sort(productos);
        System.out.println("================== Usando for ======================");

        for(int i = 0; i <= total - 1; i++){
            System.out.println("Para indice " + i + ":" + productos[i] );
        }

        System.out.println("================== Usando for reverse ======================");

        for(int i = 0; i < total; i++){
            System.out.println("Para i= " + (total-1-i) + " valor :" + productos[total-1-i] );
        }

        System.out.println("================== Usando for reverse 2 ======================");

        for(int i = total - 1; i >= 0; i--){
            System.out.println("para i = " + i + " valor :" + productos[i]);
        }


    }
}
