package org.vlz.poointerfaces.repositorio;
import org.vlz.poointerfaces.model.BaseEntity;

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
    public T byId(Integer id) {
        T result = null;
        for (T cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                result = cli;
                break;
            }
        }
        return result;
    }

    @Override
    public void create(T t) {
        this.dataSource.add(t);
    }


    @Override
    public void delete(Integer id) {
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
