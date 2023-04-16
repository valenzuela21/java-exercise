import java.util.Scanner;

public class EjemoploImprimirHistograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]  arreglo = new int[12];

        for(int i = 0; i < arreglo.length ; i++){
            System.out.print("Ingrese el numero de 1 a 6: ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.println();

        String[]  arregloHistograma =  new String[6];

        for(int i = 0; i < arregloHistograma.length; i++){
            int aux = i + 1;
            String histograma = aux + ": ";
            for(int j = 0; j < arreglo.length; j++){
                if(aux == arreglo[j]){
                    histograma += "*";
                }
            }
            arregloHistograma[i] = histograma;
        }

        for(int i = 0;  i < arregloHistograma.length; i++){
            System.out.println(arregloHistograma[i]);
        }

    }
}
