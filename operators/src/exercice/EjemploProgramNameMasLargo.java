package exercice;

import javax.swing.*;

public class EjemploProgramNameMasLargo {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo: ");
        String persona2 = JOptionPane.showInputDialog("Ingrasa el nombre y apellido de un familiar o amigo: ");
        String persona3 = JOptionPane.showInputDialog("Ingrasa el nombre y apellido de un familiar o amigo: ");

        String max =  (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ?  max : persona3;

        System.out.println("La persona con el nombre más largo es: " + max);

    }
}
