package org.vlz.poointerfaces.model;

import java.util.Objects;

public class Product extends  BaseEntity {

    private String description;
    private Double precio;

    public Product(String description, Double precio) {
        super();
        this.description = description;
        this.precio = precio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "description='" + description + '\'' +
                ", precio='" + precio + '\'';
    }
}
