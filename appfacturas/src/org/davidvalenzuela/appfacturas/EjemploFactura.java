package org.davidvalenzuela.appfacturas;

import org.davidvalenzuela.appfacturas.modelo.Cliente;
import org.davidvalenzuela.appfacturas.modelo.Factura;
import org.davidvalenzuela.appfacturas.modelo.ItemFactura;
import org.davidvalenzuela.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente client = new Cliente();
        client.setNif("5555-5");
        client.setNombre("Andrés");

        Scanner s =  new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura: ");

        Factura factura =  new Factura(s.nextLine(), client);

        Producto producto;

        System.out.println();

        for(int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n: " + producto.getCodigo() + ":");
            producto.setNombre(s.next());
            System.out.print("Ingresa el precio: ");
            producto.setPrecio(s.nextFloat());
            System.out.print("Ingresa la cantidad: ");
            factura.addItemFactura(new ItemFactura( s.nextInt(), producto));
            System.out.println();
        }
        System.out.println(factura);
    }
}
