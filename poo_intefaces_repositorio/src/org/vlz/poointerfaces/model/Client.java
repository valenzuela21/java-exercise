package org.vlz.poointerfaces.model;

import java.util.Objects;

public class Client {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Client() {
        this.id= ++ultimoId;
    }


    public Client(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return this.id.equals(client.id);
    }

}
