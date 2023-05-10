package org.exercise.poointerface;

import org.exercise.poointerface.interfaces.IProduct;

abstract public class Producto implements IProduct {
    private int precio;
    public Producto(int precio){
        this.precio =  precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
