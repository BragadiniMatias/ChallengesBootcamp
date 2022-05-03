package Ejercicio.Clase21.Controllers.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findById(long id);
    Client findByDni(long dni);
    @Modifying
    @Query(value = "UPDATE clients SET dni=:dni, first_name=:fn, last_name=:ln, address=:add, description=:des WHERE id=:id")
    Client updateClients(@Param("dni") long dni,
                     @Param("fn") String first_name,
                     @Param("ln") String last_name,
                     @Param("add") String address,
                     @Param("des") String description);
}
