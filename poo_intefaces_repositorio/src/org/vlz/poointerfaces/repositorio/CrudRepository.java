package org.vlz.poointerfaces.repositorio;

import org.vlz.poointerfaces.model.Client;

import java.util.List;

public interface CrudRepository {

    List<Client> listAll();
    Client byId(Integer id);
    void create(Client client);
    void edit(Client client);
    void delete(Integer id);
}
