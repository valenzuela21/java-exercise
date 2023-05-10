package org.davidvalenzuela.poointerfaces.imprenta.model;

public class Informe extends  Hoja implements Imprimible{

    private Persona autor;
    private String revisor;

    public Informe(Persona autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe exrito por: " +  autor.getName() + " " + autor.getSecondName() + "\n"
                + "Revisado por: " + revisor
                + "\n" + this.contenido;
    }
}
