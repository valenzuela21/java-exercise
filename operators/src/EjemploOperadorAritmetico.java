import javax.swing.*;

public class EjemploOperadorAritmetico {
    public static void main(String[] args) {
       int i =  5, j = 4, suma = i + j;
        System.out.println("Suma = " + suma);
        System.out.println("i + j = " + i + j);
        System.out.println("i + j = " + (i + j));

        int resta =  i - j;
        System.out.println("Resta = " + resta);
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("Multiplicación = " + multi);

        int div =  i / j;
        float div2 = (float) i / j;
        System.out.println("div = " +  div);
        System.out.println("div2 = " +  div2);

        int resto =  i % j;
        System.out.println("Resto = " + resto);

        resto = 8 % 5;
        System.out.println("Resto = " + resto);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
        if(number % 2  == 0){
            System.out.println("Número Par = " + number);
        }else{
            System.out.println("Número Impar = " + number);
        }
    }
}