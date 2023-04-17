import java.util.Scanner;

public class EjemploOperadorTernario {
    public static void main(String[] args) {
        String variable = (7 == 5) ? "Si es Verdadero" : "Si es falso";
        System.out.println("Variable = " +  variable);

        String estado = "";
        double promedio = 5.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia =  0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota matematicas entre 2 y 7");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota ciencia entre 2 y 7");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota historia entre 2 y 7");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("Promedio = " + promedio);
        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("Estado = " + estado);
    }
}
