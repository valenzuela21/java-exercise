package org.vlz.poointerfaces.repositorio;
import org.vlz.poointerfaces.model.BaseEntity;
import org.vlz.poointerfaces.repositorio.exceptions.ReadAccessDataException;
import org.vlz.poointerfaces.repositorio.exceptions.RegisterDuplicateException;
import org.vlz.poointerfaces.repositorio.exceptions.WriteAccessDataException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements OrdeByPageCrudRepository<T>{

    protected List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listAll() {
        return dataSource;
    }

    @Override
    public T byId(Integer id) throws ReadAccessDataException {
        if(id == null || id <= 0){
            throw new ReadAccessDataException("Id No valid debe ser > 0");
        }
        T result = null;
        for (T cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                result = cli;
                break;
            }
        }

        if(result == null){
            throw new ReadAccessDataException("No existe el registro con id:" +  id);
        }
        return result;
    }

    @Override
    public void create(T t) throws WriteAccessDataException, RegisterDuplicateException {
        if(t == null){
            throw  new WriteAccessDataException("Error al insertar un objeto null.");
        }

        if(this.dataSource.contains(t)){
            throw  new RegisterDuplicateException("Error el objeto con id " + t.getId() + " exite en el array repositorio");
        }

        this.dataSource.add(t);
    }


    @Override
    public void delete(Integer id) throws ReadAccessDataException {
        if(id == null || id <= 0){
            throw new ReadAccessDataException("Id No valid debe ser < 0");
        }
        this.dataSource.remove(this.byId(id));
    }

    @Override
    public List<T> listAll(int from, int until) {

        return dataSource.subList(from, until);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }


}
