package org.davidvalenzuela.poointerfaces.imprenta.model;

public interface Imprimible {

    final static String TEXT_DEFECTO = "Por defecto en la zona de impresión";

    default String imprimir(){
        return TEXT_DEFECTO;
    };

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
