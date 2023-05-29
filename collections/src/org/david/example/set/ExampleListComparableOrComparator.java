package org.david.example.set;

import org.david.example.model.Alumno;

import java.util.*;

public class ExampleListComparableOrComparator {
    public static void main(String[] args) {

        List<Alumno> sa =  new ArrayList<>();

        sa.add(new Alumno("Patricia", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Julian", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Lucas", 2));

        //Collections.sort(sa, (a, b) -> a.getNota().compareTo(b.getNota()));
        sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));

        System.out.println(sa);

        System.out.println("Iterando usando Stream foreach lambda");

        sa.forEach(System.out::println);
    }
}
