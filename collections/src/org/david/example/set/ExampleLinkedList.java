package org.david.example.set;

import org.david.example.model.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleLinkedList {


    public static void main(String[] args) {
        LinkedList<Alumno> enlazada =  new LinkedList<>();
        System.out.println(enlazada +  ", size:  " + enlazada.size());
        System.out.println("Esta vacia: " +  enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Julian", 8));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada);

        System.out.println("Primero: " + enlazada.getFirst());
        System.out.println("Segindo: " + enlazada.getLast());
        System.out.println("Indice 2" + enlazada.get(2));


    }
}
