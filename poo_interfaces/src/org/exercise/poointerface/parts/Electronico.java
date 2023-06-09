package org.exercise.poointerface.parts;

import org.exercise.poointerface.Producto;
import org.exercise.poointerface.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return null;
    }
}
