import javax.swing.*;

public class SetenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres =  {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Pepa"};

        int count = nombres.length;

        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")){
               continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        System.out.println("===================================================");

        for(int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("pepa".toLowerCase()) || nombres[i].toLowerCase().contains("Andres".toLowerCase())){
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }

        System.out.println("===================================================");

        String buscar = JOptionPane.showInputDialog("Ingresa mun nombre, ejemplo \"Pepe\" o \"Maria\" :");

        System.out.println("Buscar = " +  buscar);

        System.out.println("----------------------------------------------------");

        boolean encontrado = false;
        for(int i  = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("Nombre = " +  nombres[i]);
        }

        if(encontrado){
            JOptionPane.showConfirmDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + "no existe en el sistema!");
        }

    }
}
