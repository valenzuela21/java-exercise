import java.util.Scanner;

public class EjemploArregloBuscarTexto {
    public static void main(String[] args) {
        String[]  a = new  String[4];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese un texto: ");
            a[i] = s.next();
        }

        System.out.println("\r\nIngrese un nombre a buscar:");
        String text =  s.next();
        int i =  0;
        for(; i < a.length && !a[i].equalsIgnoreCase(text) ; i++){}


        /*while(i < a.length && a[i] != num){
            i++;
        }*/

        if(i == a.length){
            System.out.println("Número no encontrado");
        }else if(a[i].toLowerCase().compareTo(text.toLowerCase()) == 0){
            System.out.println("Encontrado en la posición "  +  i);
        }

    }
}
