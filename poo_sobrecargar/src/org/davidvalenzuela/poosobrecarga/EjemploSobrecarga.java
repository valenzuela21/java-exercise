package org.davidvalenzuela.poosobrecarga;

import static  org.davidvalenzuela.poosobrecarga.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {
        System.out.println("Sumar int: " + sumar(10,5));
        System.out.println("Sumar float: " + sumar(10.0f, 5f));
        System.out.println("Sumar float-int: " + sumar(10f, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0f));
        System.out.println("Sumar double: " +  sumar(10.0, 5.0 ));
        System.out.println("Sumar String: " + sumar("5", "10"));
        System.out.println("Sumar tres enteros: " + sumar(4,6,9));
        System.out.println("Sumar cuatro enteros: " + sumar(3,4,6,9));
        System.out.println("Sumar cinco enteros: " + sumar(3,4,6,9,12));
        System.out.println("Sumar float +  n int: " + sumar(10.5f,3,4,6,9,12));
        System.out.println("Sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " +  sumar(10, '@'));
        System.out.println("Sumar float-int: " +  sumar(10f, '@'));


    }
}
