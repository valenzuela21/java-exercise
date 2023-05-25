package org.vlz.poointerfaces;

import org.vlz.poointerfaces.model.Client;
import org.vlz.poointerfaces.model.Product;
import org.vlz.poointerfaces.repositorio.Direction;
import org.vlz.poointerfaces.repositorio.OrdeByPageCrudRepository;
import org.vlz.poointerfaces.repositorio.exceptions.AccesDataException;
import org.vlz.poointerfaces.repositorio.exceptions.ReadAccessDataException;
import org.vlz.poointerfaces.repositorio.list.ClientListRepository;
import org.vlz.poointerfaces.repositorio.list.ProductListRepository;

import java.util.List;

public class ExampleRepositoryProduct {
    public static void main(String[] args) {
        try {
        OrdeByPageCrudRepository<Product> repo =  new ProductListRepository();
        repo.create(new Product("Mesa", 50.52));
        repo.create(new Product("Silla", 30.45));
        repo.create(new Product("Lampara", 22.40));
        repo.create(new Product("notebook", 12.20));

        List<Product> products = repo.listAll();
        products.forEach(System.out::println);

        System.out.println("===== Paginable ====");
        List<Product> paginableProduct = repo.listAll(1, 3);
        paginableProduct.forEach(System.out::println);

        System.out.println("===== Order Desc ====");
        List<Product> productsOrderDesc =  repo.listAll("descripcion", Direction.DESC);
        for(Product c : productsOrderDesc){
            System.out.println(c);
        }

        System.out.println("===== Order Asc ====");
        List<Product> productsOrderAsc =  repo.listAll("precio", Direction.ASC);
        for(Product c : productsOrderAsc){
            System.out.println(c);
        }

        System.out.println("===== Editar Product ====");

        Product beaUpdate = new Product("Tv", 90.89);
        beaUpdate.setId(2);
        repo.edit(beaUpdate);
        Product tv = repo.byId(2);
        System.out.println(tv);

        System.out.println("===== Eliminar Product ====");
        repo.delete(2);

        System.out.println("===== Total ====");
        System.out.println("Total Regsiter: " + repo.total());
        }catch (ReadAccessDataException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (AccesDataException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
