package org.vlz.poointerfaces.repositorio;

import org.vlz.poointerfaces.model.Client;

import java.util.List;

public interface PageRepository {
    List<Client> listAll(int from, int until);
}
