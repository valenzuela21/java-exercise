package org.vlz.generics;

import org.vlz.poointerfaces.model.Client;
import org.vlz.poointerfaces.model.ClientPremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleGenerics {
    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();

        clients.add(new Client("Andres", "Guzmán"));

        Client andres = clients.iterator().next();


        Client[] clientsArray = {new Client("Luci", "Marinez"), new Client("Andres", "Guzmán")};
        Integer[] numbersArray = {1, 2, 3};
        List<Client> clientList = fromArrayToList(clientsArray);
        List<Integer> enterosList = fromArrayToList(numbersArray);

        clientList.forEach(System.out::println);
        enterosList.forEach(System.out::println);

        List<String> names =  fromArrayToList(new String[]{"Andrés", "Pepe", "Luci", "Bea", "John"}, numbersArray);
        names.forEach(System.out::println);

        List<ClientPremium> clientPremiumList = fromArrayToList(
                new ClientPremium[]{new ClientPremium("Andrea", "Garcia"), new ClientPremium("Juan", "Peñon"), new ClientPremium("Leonardo", "Casas")});

        printClients(clients);
        printClients(clientList);
        printClients(clientPremiumList);

        System.out.println("Máximo de 1 y 9 y 4 es: " +  maxTo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6, 7.78 es: " + maxTo(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos, manzana es: "  + maxTo("zanahoria", "arándanos", "manzana"));
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    /*public static List<Client> fromArrayToList(Client[] c) {
        return Arrays.asList(c);
    }*/

    public static <T extends Client & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }


    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for(G element: x){
            System.out.println(element);
        }


        return Arrays.asList(c);
    }

    public static  void printClients(List<? extends Client> clients) {
        clients.forEach(System.out::println);

    }


    public static <T extends Comparable<T>> T maxTo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
