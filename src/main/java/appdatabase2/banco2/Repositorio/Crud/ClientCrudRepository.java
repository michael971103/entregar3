package appdatabase2.banco2.Repositorio.Crud;

import appdatabase2.banco2.Modelo.Bike;
import appdatabase2.banco2.Modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client,Integer> {
}
