package org.example.exercise.verduleria;

import org.example.exercise.verduleria.gerarquia.*;

public class AlmacenVerduleria {
    public static void main(String[] args) {
        Producto[]  productos = new Producto[8];
        productos[0] =  new Fruta("Manzana", 1200.00, 2550d, "Roja");
        productos[1] =  new Fruta("Manzana", 1200.00, 2550d, "Roja");
        productos[2] =  new Limpieza("Lavaloza", 1.2, "Quix", 2290);
        productos[3] = new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1150);
        productos[4] = new Lacteo("Leche Sabor Chocolate Semidescremada", 1000, 32 , 1190);
        productos[5] = new Lacteo("Yoghurt Batido Sabor Frutilla Bolsa", 1000, 37, 300 );
        productos[6] = new NoPerecible("Atún Lomitos Agua Angelmo", 4000, 170, 3900);
        productos[7] =  new NoPerecible("Protos Hallado Bolsa", 2300, 34, 290);

        for(Producto prod: productos){
            System.out.println("-----------------------------" +  prod.getClass().getSimpleName() + "------------------------------");
        }



    }
}
