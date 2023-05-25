package org.vlz.poointerfaces.repositorio;

import org.vlz.poointerfaces.model.Client;

import java.util.List;

public interface PageRepository<T> {
    List<T> listAll(int from, int until);
}
