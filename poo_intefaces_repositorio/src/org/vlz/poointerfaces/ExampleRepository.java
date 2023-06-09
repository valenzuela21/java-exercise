package org.vlz.poointerfaces;

import org.vlz.poointerfaces.model.Client;
import org.vlz.poointerfaces.repositorio.*;
import org.vlz.poointerfaces.repositorio.exceptions.AccesDataException;
import org.vlz.poointerfaces.repositorio.exceptions.ReadAccessDataException;
import org.vlz.poointerfaces.repositorio.exceptions.RegisterDuplicateException;
import org.vlz.poointerfaces.repositorio.exceptions.WriteAccessDataException;
import org.vlz.poointerfaces.repositorio.list.ClientListRepository;

import java.util.List;

public class ExampleRepository {
    public static void main(String[] args) {

        try {
            OrdeByPageCrudRepository<Client> repo = new ClientListRepository();
            repo.create(new Client("Jano", "Peres"));
            repo.create(new Client("Luisa", "Veltran"));
            repo.create(new Client("Andres", "Sandoval"));
            repo.create(new Client("Carlos", "Quintero"));
            Client andres =  new Client("Andrés", "Guzmán");
            repo.create(andres);
            repo.create(andres);

            //repo.create(null);

            List<Client> clients = repo.listAll();
            clients.forEach(System.out::println);

            System.out.println("===== Paginable ====");
            List<Client> paginable = repo.listAll(1, 3);
            paginable.forEach(System.out::println);

            System.out.println("===== Order Desc ====");
            List<Client> clientsOrderDesc = repo.listAll("nombre", Direction.DESC);
            for (Client c : clientsOrderDesc) {
                System.out.println(c);
            }

            System.out.println("===== Order Asc ====");
            List<Client> clientsOrderAsc = repo.listAll("apellido", Direction.ASC);
            for (Client c : clientsOrderAsc) {
                System.out.println(c);
            }


            System.out.println("===== Editar ====");
            Client beaUpdate = new Client("Luisa", "Mena");
            beaUpdate.setId(2);
            repo.edit(beaUpdate);
            Client luisa = repo.byId(2);
            System.out.println(luisa);

            System.out.println("===== Eliminar ====");
            repo.delete(50);
            repo.listAll().forEach(System.out::println);

            System.out.println("===== Total ====");
            System.out.println("Total Regsiter: " + repo.total());
        }catch (ReadAccessDataException e){
            System.out.println("Read: " + e.getMessage());
            e.printStackTrace();
        }catch (WriteAccessDataException e){
            System.out.println("Write: " + e.getMessage());
            e.printStackTrace();
        }catch (RegisterDuplicateException e){
            System.out.println("Duplicate: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesDataException e){
            System.out.println("Generic: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
