import java.util.Scanner;

public class SetenciaIfEleseNumeroDiasMes {
    public static void main(String[] args) {
        int  numberDay =  0;

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Ingrese el mes de año (1 al 12): ");
        int mes = scanner.nextInt();
        System.out.println();

        System.out.print("Ingrese el año (yyyy): ");
        int ano = scanner.nextInt();
        System.out.println();

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ||  mes == 12){
            numberDay = 31;
        } else if (mes == 4 || mes == 6 || mes  == 9 || mes  == 11) {
            numberDay = 30;
        } else if (mes == 2){
            if(ano % 400 == 0 || ((ano % 4 == 0) && !(ano % 100 == 0))){
                numberDay = 29;
            }else{
                numberDay = 28;
            }
        }
        System.out.println("Número de días: " + numberDay);
    }
}
