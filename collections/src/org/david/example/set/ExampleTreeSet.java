package org.david.example.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        Set<String> ts =  new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts: " +  ts);


        Set<Integer> number =  new TreeSet<>((a,b) -> b.compareTo(a));
        number.add(2);
        number.add(5);
        number.add(1);
        number.add(3);
        number.add(4);

        System.out.println("Number list: " +  number);

        Set<Integer> number2 =  new TreeSet<>(Comparator.reverseOrder());
        number2.add(2);
        number2.add(5);
        number2.add(1);
        number2.add(3);
        number2.add(4);

        System.out.println("Number list: " +  number);
    }
}
