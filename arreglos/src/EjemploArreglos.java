import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos =  new String[7];

        productos[0] = "Kingston Pendrive  64Gb";
        productos[1] = "Sansumg Galaxy";
        productos[2] = "Maleta totto";
        productos[3] = "Biclite ELectrica Oxford";
        productos[4] = "Mackbook Pro";
        productos[5] = "Tv LG";
        productos[6] = "Asus Notebook";

        Arrays.sort(productos);

        System.out.println("product[0] = " + productos[0]);
        System.out.println("product[1] = " + productos[1]);
        System.out.println("product[2] = " + productos[2]);
        System.out.println("product[3] = " + productos[3]);
        System.out.println("product[3] = " + productos[4]);
        System.out.println("product[3] = " + productos[5]);
        System.out.println("product[3] = " + productos[6]);

        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 3;
        numeros[3] = 4;
        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("j = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}