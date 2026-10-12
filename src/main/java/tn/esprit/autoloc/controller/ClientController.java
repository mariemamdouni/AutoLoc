package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.interfaces.IClientService;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    IClientService clientService;

    @GetMapping("/retrieve-all-clients")
    public Set<Client> getClients() {
        Set<Client> listClients = clientService.getAllClients();
        return listClients;
    }

    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        Client client = clientService.getClientById(clientId);
        return client;
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        Client newClient = clientService.addClient(client);
        return newClient;
    }

    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.deleteClient(clientId);
    }

    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client client) {
        Client updatedClient = clientService.updateClient(client);
        return updatedClient;
    }
}
