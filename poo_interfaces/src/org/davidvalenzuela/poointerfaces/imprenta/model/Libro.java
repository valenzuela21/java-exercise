package org.davidvalenzuela.poointerfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    private List<Imprimible> pages;
    private Persona author;
    private String title;
    private Genero gender;

    public Libro(Persona author, String title, Genero gender) {
        this.author = author;
        this.title = title;
        this.gender = gender;
        this.pages = new ArrayList<>();
    }


    public Libro addPage(Imprimible page){
        pages.add(page);
        return this;
    }


    /*
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.title).append("\n")
                .append("Autor: ").append(this.author.toString()).append("\n")
                .append("Genero: ").append(this.gender).append("\n");

        for(Imprimible page: this.pages){
            sb.append(page.imprimir()).append("\n");
        }
        return sb.toString();
    }*/
}
