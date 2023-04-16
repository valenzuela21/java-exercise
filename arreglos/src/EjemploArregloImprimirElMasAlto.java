import java.util.Scanner;

public class EjemploArregloImprimirElMasAlto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese un numero de 11 a 99: ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println();

        int max = 0;
        //Obtener el valor mayor
        for(int i = 0; i < 7 ; i++){
            max = (max > arreglo[i])? max : arreglo[i];
        }

        System.out.println("El valor mas alto es: " +  max);
    }
}
