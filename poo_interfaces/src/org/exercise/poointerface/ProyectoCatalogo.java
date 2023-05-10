package org.exercise.poointerface;

import org.exercise.poointerface.interfaces.IElectronico;
import org.exercise.poointerface.interfaces.ILibro;
import org.exercise.poointerface.interfaces.IProduct;
import org.exercise.poointerface.parts.IPhone;

public class ProyectoCatalogo {

    public static void main(String[] args) {
        IProduct[] products =  new Producto[6];
        products[0] = new IPhone(299000, "Apple", "3G", "Negro");
        products[1] = new IPhone(399000, "Apple", "4G", "Blanco");
        products[2] = new TvLcd(340000, "Sony", 40);
        products[3] = new Libro(1800000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
        products[4] = new Libro(140000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
        products[5] = new Comics(5000, "Pepo", "Condorito", "Alguna...", "Condorito");

        for(IProduct product: products){
            System.out.println("Tipo de: " +  product.getClass().getName());
            System.out.println(" - ");
            System.out.println("Precio: " + product.getPrecio());
            System.out.println(" - ");
            System.out.println("Precio final: " + product.getPrecioVenta());

            if(product instanceof IElectronico){
                System.out.println(" - ");
                System.out.println("Fabricante: " + ((IElectronico) product).getFabricante());

                if(product instanceof  IPhone){
                    System.out.println(" - ");
                    System.out.println("Modelo: " + ((IPhone) product).getModelo() );
                    System.out.println(" - ");
                    System.out.println("Color: " + ((IPhone) product).getColor());
                }

                if(product instanceof  TvLcd){
                    System.out.println(" - ");
                    System.out.println("Pulgadas: " + ((TvLcd) product).getPulgada());
                }
            }

            if(product instanceof ILibro){
                System.out.println(" - ");
                System.out.println("Titulo: " +  ((ILibro) product).getTitulo());
                System.out.println(" - ");
                System.out.println("Autor: " +  ((ILibro) product).getAutor());
                if(product instanceof  Comics){
                    System.out.println(" - ");
                    System.out.println("Personaje: " +  ((Comics) product).getPersonaje());
                }
            }
            System.out.println();
        }
    }

}
