package org.vlz.poointerfaces.repositorio.list;

import org.vlz.poointerfaces.model.Client;
import org.vlz.poointerfaces.repositorio.AbstractListRepository;
import org.vlz.poointerfaces.repositorio.Direction;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository extends AbstractListRepository<Client> {

    @Override
    public Client byId(Integer id) {
        Client result = null;
        for (Client cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                result = cli;
                break;
            }
        }
        return result;
    }


    @Override
    public void edit(Client client) {
        Client c = this.byId(client.getId());
        c.setNombre(client.getNombre());
        c.setApellido(client.getApellido());
    }


    @Override
    public List<Client> listAll(String input, Direction dir) {
        List<Client> listOrder = new ArrayList<>(this.dataSource);
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


}
