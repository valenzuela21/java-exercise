import java.util.Arrays;

public class EjemploforArreglosFor {

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


        System.out.println("================== Usando for ======================");
        for(String prod: productos){
            System.out.println("Product:  " + prod );
        }

        System.out.println("================== Usando for ======================");

        int i = 0;
        while(i < total){
            System.out.println("Para indice " + i + ":" + productos[i] );
            i++;
        }

        System.out.println("================== do while ======================");

        int j = 0;
        do{
            System.out.println("Para indice " + j + ":" + productos[j] );
            j++;
        } while(j < total);

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros;  k++){
            numeros[k] = k * 3;
        }
        for(int k = 0; k < totalNumeros;  k++){
            System.out.println("Para indice " + k + ":" + numeros[k] );
        }
    }


}
