package exercice;

import java.util.Scanner;

public class EjemploEstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacidadActual;

        System.out.println("Introduzca la capacidad actual de estanque (máx 70 litros): ");
        capacidadActual = scanner.nextDouble();

        if (capacidadActual >= 0 && capacidadActual < 20){
            System.out.println("Insuficiente");
        }else if(capacidadActual >= 20 && capacidadActual < 25){
            System.out.println("Suficiente");
        }else if(capacidadActual >= 35 && capacidadActual < 40){
            System.out.println("Estanque 3/4");
        }else if(capacidadActual <=  40 && capacidadActual < 60){
            System.out.println("Estanque casi lleno");
        }else if(capacidadActual == 70){
            System.out.println("Estanque lleno");
        }
    }
}
