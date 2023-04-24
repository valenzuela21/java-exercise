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
        System.out.println("Ingrese una descripción de la factura:");

        String desc =  s.nextLine();
        Factura factura =  new Factura(desc, client);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n: " + producto.getCodigo() + ":");
            nombre = s.next();
            producto.setNombre(nombre);
            System.out.print("Ingresa el precio: ");
            precio =  s.nextFloat();
            producto.setPrecio(precio);
            System.out.print("Ingresa la cantidad: ");
            cantidad = s.nextInt();
            ItemFactura item =  new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
