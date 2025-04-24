package br.com.prsr.challengecrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.prsr.challengecrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
