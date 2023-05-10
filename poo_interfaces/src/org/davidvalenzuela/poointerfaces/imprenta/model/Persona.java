package org.davidvalenzuela.poointerfaces.imprenta.model;

public class Persona {
    private String name;
    private String secondName;


    public Persona() {
    }

    public Persona(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return  name + ' ' + secondName;
    }
}
