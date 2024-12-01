package com.mohamedAdel.facturation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedAdel.facturation.dto.Clientdto;
import com.mohamedAdel.facturation.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class Clientcotroller {
	 @Autowired
	    private ClientService clientService;
	    @PostMapping
	    public ResponseEntity<Clientdto> createClient(@RequestBody Clientdto clientDTO) {
	    	Clientdto createdClient = clientService.createClient(clientDTO);
	        return ResponseEntity.ok(createdClient);
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Clientdto> getClientById(@PathVariable Long id) {
	    	Clientdto client = clientService.getClientById(id);
	        return ResponseEntity.ok(client);
	    }
	    @GetMapping
	    public ResponseEntity<List<Clientdto>> getAllClients() {
	        List<Clientdto> clients = clientService.getAllClients();
	        return ResponseEntity.ok(clients);
	    }
	    @PutMapping("/{id}")
	    public ResponseEntity<Clientdto> updateClient(@PathVariable Long id, @RequestBody Clientdto clientDTO) {
	    	Clientdto updatedClient = clientService.updateClient(id, clientDTO);
	        return ResponseEntity.ok(updatedClient);
	    }
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
	        clientService.deleteClient(id);
	        return ResponseEntity.noContent().build();
	    }
}
