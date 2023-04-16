import java.util.Scanner;

public class EjemplosArreglosDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        boolean ascendente = false;
        boolean descent = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descent = true;
            }

            if (a[i] < a[i + 1]) {
                ascendente = true;
            }
        }

        if(ascendente == true && descent == true){
            System.out.println("ARRAY =  DESORDENADO");
        }

        if(ascendente == false && descent == false){
            System.out.println("ARRAY =  IGUALES");
        }

        if(ascendente == true && descent == false){
            System.out.println("ARRAY =  ASCENDENTE");
        }

        if(ascendente == false && descent == true){
            System.out.println("ARRAY =  DESCENTE");
        }


    }
}
