package org.vlz.poointerfaces.model;

public class ClientPremium extends Client implements Comparable<ClientPremium> {

    public ClientPremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientPremium clientPremium) {
        return 0;
    }
}
