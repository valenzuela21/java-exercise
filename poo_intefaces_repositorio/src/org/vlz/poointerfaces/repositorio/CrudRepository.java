package org.vlz.poointerfaces.repositorio;
import java.util.List;

public interface CrudRepository<T> {

    List<T> listAll();
    T byId(Integer id);
    void create(T object);
    void edit(T object);
    void delete(Integer id);
}
