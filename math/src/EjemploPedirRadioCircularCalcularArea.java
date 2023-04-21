import java.util.Scanner;

public class EjemploPedirRadioCircularCalcularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area, radio;

        System.out.println("Introduce el radio de un circulo: ");
        radio = scanner.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área de una circuferecnia de radio: " + radio + " es: " + area);
    }
}
