package org.vlz.poointerfaces.repositorio;

import org.vlz.poointerfaces.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository implements OrdeByPageCrudRepository{

    private List<Client> dataSource;

    public ClientListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Client> listAll() {
        return dataSource;
    }

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
    public void create(Client client) {
        this.dataSource.add(client);
    }

    @Override
    public void edit(Client client) {
        Client c = this.byId(client.getId());
        c.setNombre(client.getNombre());
        c.setApellido(client.getApellido());
    }

    @Override
    public void delete(Integer id) {
        this.dataSource.remove(this.byId(id));
    }

    @Override
    public List<Client> listAll(int from, int until) {

        return dataSource.subList(from, until);
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


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
