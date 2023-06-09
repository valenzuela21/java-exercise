package org.david.example.map;

import java.util.*;

public class ExampleHasMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put(null, "Name Null llave");
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Dore");
        persona.put("apellidoPaterno", "Caicedo");
        persona.put("email", "jotn.doe@gmail.com");
        persona.put("edad", "30");

        Map<String, String> address = new HashMap<>();
        address.put("pais", "USA");
        address.put("estado", "California");
        address.put("ciudad", "Santa Barbara");
        address.put("calle", "One Street");

        persona.put("address", address);

        System.out.println("Person = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("Nombre = " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("Apellido = " + apellido);


        Map<String, String> addressPerson = (Map<String, String>) persona.get("address");
        String country = addressPerson.get("pais");
        String city = addressPerson.get("ciudad");
        String neighborhood = addressPerson.getOrDefault("barrio", "La Playa");
        System.out.println("El pais de " + nombre + "es: " + country);
        System.out.println("El ciudad de " + nombre + "es: " + city);
        System.out.println("El barrio de " + nombre + "es: " + neighborhood);

        //String  value = persona.remove("apellido");
        boolean value = persona.remove("apellidoPaterno", "Caicedo");
        System.out.println("Delete: " + value);
        System.out.println("Person = " + persona);


        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);


        b2 = persona.containsValue("Dore");
        System.out.println("b2 = " + b2);


        Collection<Object> values = persona.values();

        for (Object v : values) {
            System.out.println("V = " + v);
        }

        System.out.println("=================================== keySet");
        Set<String> llaves = persona.keySet();

        for (String k : llaves) {
            System.out.println("K = " + k);

        }
        System.out.println("=================================== entrySet");
        for (Map.Entry<String, Object> par : persona.entrySet()) {
            Object valor = par.getValue();
            if (valor instanceof Map) {
                String name = (String) persona.get("nombre");
                Map<String, String> addressMap = (Map<String, String>) valor;
                System.out.println("El pais de" + name + ": " + addressMap.get("pais"));
                System.out.println("El ciudad de" + name + ": " + addressMap.get("city"));
                System.out.println("El barrio de" + name + ": " + addressMap.getOrDefault("barrio", "La playa"));
            } else {
                System.out.println(par.getKey() + " => " + valor);
            }


        }
        System.out.println("=================================== keySet");
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            if (valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> addressMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir : addressMap.entrySet()) {
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            } else {
                System.out.println(llave + "=>" + valor);
            }

        }
        System.out.println("=================================== java 8 forEach");
        persona.forEach((key, valor) -> System.out.println(key + " " + valor));

        System.out.println("Total: " + persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());

        boolean b3 = persona.replace("nombre", "Jhon", "Andres");
        System.out.println("b3 = " + b3);
        System.out.println("Persona = " + persona);

    }
}
