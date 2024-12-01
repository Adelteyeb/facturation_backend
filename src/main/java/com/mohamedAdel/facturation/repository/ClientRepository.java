package com.mohamedAdel.facturation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohamedAdel.facturation.entite.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
