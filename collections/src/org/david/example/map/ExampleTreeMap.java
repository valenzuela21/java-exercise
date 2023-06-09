package org.david.example.map;

import java.util.*;

public class ExampleTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Dore");
        persona.put("apellidoPaterno", "Caicedo");
        persona.put("email", "jotn.doe@gmail.com");
        persona.put("edad", "30");

        Map<String, String> address = new TreeMap<>((a,b) -> a.compareTo(b));
        address.put("pais", "USA");
        address.put("estado", "California");
        address.put("ciudad", "Santa Barbara");
        address.put("calle", "One Street");

        persona.put("address", address);

        System.out.println("Person = " + persona);


    }
}
