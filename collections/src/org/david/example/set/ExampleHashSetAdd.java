package org.david.example.set;

import java.util.*;

public class ExampleHashSetAdd {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");


        List<String> list = new ArrayList<>(hs);

        Collections.sort(list);

        System.out.println(list);


    }

}
