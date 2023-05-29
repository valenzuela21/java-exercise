package org.david.example.set;

import org.david.example.model.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa =  new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));

        sa.add(new Alumno("Patricia", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Julian", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));

        System.out.println(sa);
    }
}
