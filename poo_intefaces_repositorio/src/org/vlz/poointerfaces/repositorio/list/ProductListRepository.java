package org.vlz.poointerfaces.repositorio.list;

import org.vlz.poointerfaces.model.Client;
import org.vlz.poointerfaces.model.Product;
import org.vlz.poointerfaces.repositorio.AbstractListRepository;
import org.vlz.poointerfaces.repositorio.Direction;
import org.vlz.poointerfaces.repositorio.exceptions.ReadAccessDataException;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepository extends AbstractListRepository<Product> {
    @Override
    public void edit(Product product) throws ReadAccessDataException {
        Product p = byId(product.getId());
        p.setDescription(product.getDescription());
        p.setPrecio(product.getPrecio());

    }

    @Override
    public List<Product> listAll(String input, Direction dir) {
        List<Product> listOrder = new ArrayList<>(this.dataSource);
        listOrder.sort((a, b) -> {
            int result = 0;

            if (dir == Direction.ASC) {
                result = order(input, a, b);
            } else if (dir == Direction.DESC) {
                result = order(input, b, a);
            }
            return result;
        });

        return listOrder;
    }

    public static int order(String input, Product a, Product b) {
        int result = 0;
        switch (input) {
            case "id" -> result = a.getId().compareTo(b.getId());
            case "descripcion" -> result = a.getDescription().compareTo(b.getDescription());
            case "precio" -> result = a.getPrecio().compareTo(b.getPrecio());
        }
        return result;
    }


}
