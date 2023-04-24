package org.davidvalenzuela.poosobrecarga;

public class Calculadora {
    private Calculadora() {
    }

    public static int sumar(int... arguments){
        int total = 0;
        for(int i: arguments){
            total +=  i;
        }
        return total;
    }

    public static float sumar(float a, int... arguments){
        float total = a;
        for(int i: arguments){
            total +=  i;
        }
        return total;
    }
    public static int sumar(int a, int b ){
        return a + b;
    }

    public static float sumar(float x, float y) {
        return x + y;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float sumar(float i, int j){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        int result;
        try {
            result = Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e){
            result = 0;
        }
        return result;
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }
}
