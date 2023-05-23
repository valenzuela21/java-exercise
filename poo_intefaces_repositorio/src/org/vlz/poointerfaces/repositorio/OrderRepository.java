package org.vlz.poointerfaces.repositorio;

import org.vlz.poointerfaces.model.Client;

import java.util.List;

public interface OrderRepository<T> {
    List<T> listAll(String input, Direction dir);

    default int order(String input, Client a, Client b) {
        int result = 0;
        switch (input) {
            case "id" -> result = a.getId().compareTo(b.getId());
            case "nombre" -> result = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> result = a.getApellido().compareTo(b.getApellido());
        }
        return result;
    }

}
