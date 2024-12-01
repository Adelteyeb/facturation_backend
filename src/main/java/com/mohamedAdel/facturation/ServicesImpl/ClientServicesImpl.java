package com.mohamedAdel.facturation.ServicesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamedAdel.facturation.dto.Clientdto;
import com.mohamedAdel.facturation.entite.Client;
import com.mohamedAdel.facturation.repository.ClientRepository;
import com.mohamedAdel.facturation.service.ClientService;
@Service
public class ClientServicesImpl  implements ClientService{


	   @Autowired
	    private ClientRepository clientRepository;
	    @Override
	    public Clientdto createClient(Clientdto clientDTO) {
	    	Client client =Clientdto.toEntity(clientDTO);
	
	        client = clientRepository.save(client);
	        return Clientdto.fromEntity(client);
	    }
	    @Override
	    public Clientdto getClientById(Long id) {
	        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
	        return Clientdto.fromEntity(client);
	    }
	    @Override
	    public List<Clientdto> getAllClients() {
	        List<Client> clients = clientRepository.findAll();
	        return clients.stream().map(Clientdto::fromEntity).collect(Collectors.toList());
	    }
	    @Override
	    public Clientdto updateClient(Long id, Clientdto clientDTO) {
	        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
	        
	        client.setNom(clientDTO.getNom());
	        client.setMatriculefiscale(clientDTO.getMatriculefiscale());
	        client.setNumroTel(clientDTO.getNumroTel());
	        
	        client = clientRepository.save(client);
	        return Clientdto.fromEntity(client);
	    }
	    @Override
	    public void deleteClient(Long id) {
	        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
	        clientRepository.delete(client);
	    }
		


}
