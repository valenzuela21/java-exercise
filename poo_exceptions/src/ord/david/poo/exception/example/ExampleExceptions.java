package ord.david.poo.exception.example;

import javax.swing.*;

public class ExampleExceptions {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String divisor = JOptionPane.showInputDialog("Ingrese un entero denominador: ");
        //int divisor = Integer.parseInt(valor);

        try {
            /*double dividir = cal.dividir(10, divisor);
            System.out.println(dividir);*/

            double dividir2 = cal.dividir(numerador, divisor);
            System.out.println(dividir2);

        } catch (DiviByZeroException e) {
            System.out.println("Capturamos la exceptions en tiempo de ejecución: " + e.getMessage());
            main(args);
        } catch (NumberFormatPersonException e) {
            System.out.println("Capturamos la exceptions String convertiendo a número: " + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Cerrar conección database");
        }
        System.out.println("Continuamos con dicha ejecución...");
    }
}
