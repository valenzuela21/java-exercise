package org.vlz.poointerfaces.repositorio;
import org.vlz.poointerfaces.repositorio.exceptions.AccesDataException;
import org.vlz.poointerfaces.repositorio.exceptions.ReadAccessDataException;
import org.vlz.poointerfaces.repositorio.exceptions.WriteAccessDataException;

import java.util.List;

public interface CrudRepository<T> {

    List<T> listAll();
    T byId(Integer id) throws AccesDataException;
    void create(T object) throws AccesDataException;
    void edit(T object) throws AccesDataException;
    void delete(Integer id) throws AccesDataException;
}
