package Ejercicio.Clase21.Controllers.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
    @Autowired
    ClientRepository cr;

    public ArrayList<Client> getAllClients() { return (ArrayList<Client>) cr.findAll(); }

    public void saveClient(Client client) { cr.save(client); }

    public void deleteClient(long id) {
        Client client=new Client();
        client=cr.findById(id);
        cr.delete(client);
    }
    public Client getOneUser(long dni) {
        return cr.findByDni(dni);
    }

    public Client findById(long id) { return cr.findById(id); }

    public Client updateClient(long id) {
        Client client=findById(id);
        return cr.updateClients(client.getDni(), client.getFirst_name(), client.getLast_name(), client.getAddress(), client.getDescription());
    }
}
