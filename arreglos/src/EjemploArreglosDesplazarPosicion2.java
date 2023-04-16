import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a  = new int[10];
        int elemento, posicion;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length - 1; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Nuevo Elemento");
        elemento = s.nextInt();

        System.out.println("Posición agregar el elemento");
        posicion = s.nextInt();

        for(int i =  a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println("El arreglo is: ");
        for(int i = 0; i < a.length; i++){
            System.out.println("Index no. " + i + " : " + a[i]);
        }

    }
}
