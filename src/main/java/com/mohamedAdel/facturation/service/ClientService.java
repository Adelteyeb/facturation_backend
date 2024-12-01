package com.mohamedAdel.facturation.service;

import java.util.List;

import com.mohamedAdel.facturation.dto.Clientdto;

public interface ClientService {


	Clientdto createClient(Clientdto clientDTO);
	Clientdto getClientById(Long id);
    List<Clientdto> getAllClients();
    Clientdto updateClient(Long id, Clientdto clientDTO);
    void deleteClient(Long id);
}