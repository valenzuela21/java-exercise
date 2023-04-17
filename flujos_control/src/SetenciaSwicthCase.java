import java.util.Scanner;

public class SetenciaSwicthCase {
    public static void main(String[] args) {
        System.out.println("Ingrese el número del mes");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case 0:
                System.out.println("El mes cero");
                break;
            case 1:
                System.out.println("EL Mes uno");
                break;
            case 2:
                System.out.println("El mes es dos");
                break;
            case 3:
                System.out.println("El mes es tres");
                break;
            default:
                System.out.println("Ninguna de las anteriores");
        }


        String nombreMes = null;
        switch (number){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Mayo";
                break;
            case 7:
                nombreMes = "Junio";
                break;
            case 8:
                nombreMes = "Julio";
                break;
            case 9:
                nombreMes = "Agosto";
                break;
            case 10:
                nombreMes = "Septiembre";
                break;
            case 11:
                nombreMes = "Octubre";
                break;
            case 12:
                nombreMes = "Noviembre";
                break;
            case 13:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = null;

        }

        System.out.println("Este es el mes seleccionado: " + nombreMes);

    }
}
