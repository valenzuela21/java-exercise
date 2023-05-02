package org.example.exercise.verduleria.gerarquia;

public class Limpieza extends  Producto{

    private String components;
    private double litros;

    public Limpieza(String nombre, double precio, String components, double litros) {
        super(nombre, precio);
        this.components = components;
        this.litros = litros;
    }

    public String getComponents() {
        return components;
    }

    public double getLitros() {
        return litros;
    }
}
