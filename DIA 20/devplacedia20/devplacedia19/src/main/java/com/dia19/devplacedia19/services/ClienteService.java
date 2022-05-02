package com.dia19.devplacedia19.services;

import com.dia19.devplacedia19.model.Cliente;
import com.dia19.devplacedia19.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository cr;

    //GET ALL USERS:

    public List<Cliente> getAllClients(){
        return (List<Cliente>) cr.findAll();
    }
    //Get a specific user

    public Cliente findByDni(long dni){
        return cr.findByDni(dni);
    }

    public void insertClient(Cliente c){
        cr.save(c);
    }

    public void deleteUser(Cliente c ){
        cr.delete(c);
    }


    public boolean updateCliente(Cliente cl){
        cr.save(cl);
        return true;
    }







}
