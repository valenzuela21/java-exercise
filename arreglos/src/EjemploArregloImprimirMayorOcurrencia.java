import java.util.Scanner;

public class EjemploArregloImprimirMayorOcurrencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero de 1 a 9: ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.println();

        int[] arregloCantidadValores = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }

            }
            arregloCantidadValores[i] = cantidad;
        }


        int indice = 0;
        int max = 0;
        for(int i = 0; i < 10; i++){
            if(max < arregloCantidadValores[i]){
                max = arregloCantidadValores[i];
                indice = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + arreglo[indice]);
        System.out.println("El elemento " +  arreglo[indice] + " esta repetido " + max + " veces!");


    }
}
