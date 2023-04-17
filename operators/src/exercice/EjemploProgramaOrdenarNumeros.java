package exercice;

import java.util.Scanner;

public class EjemploProgramaOrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número 1: ");
        int num1 = scanner.nextInt();
        System.out.println();

        System.out.print("Ingrese el número 2: ");
        int num2 = scanner.nextInt();

        System.out.println();

        String result = (num1 > num2) ?  num1 + " y " + num2 : num2 +  " y " + num1;
        System.out.println("El orden es: " +  result);
    }
}
