package com.bairesdev.ClientManager.controller;

import com.bairesdev.ClientManager.model.entity.Client;
import com.bairesdev.ClientManager.model.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="client")
public class ClientController {
    @Autowired
    private IClientService clientService;

    //creating a get mapping that retrieves the detail of all clients
    @GetMapping()
    public List<Client> getTasks() {
        return clientService.getClient();
    }

    //creating a get mapping that retrieves the detail of a specific client
    @GetMapping("/{id}")
    private Client getStudent(@PathVariable("id") Integer id) {
        return clientService.getClientById(id).get();
    }

    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/{id}")
    private void deleteStudent(@PathVariable("id") int id) {
        clientService.deleteClientById(id);
    }
    //creating post mapping that post the student detail in the database
    @PostMapping()
    private Client saveStudent(@RequestBody Client client) {
        clientService.saveOrUpdateClient(client);
        return client;
    }
}
