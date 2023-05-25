package org.vlz.poointerfaces.repositorio;

public interface OrdeByPageCrudRepository<T> extends  OrderRepository<T>, PageRepository<T>, CrudRepository<T>, CountTable {
}
