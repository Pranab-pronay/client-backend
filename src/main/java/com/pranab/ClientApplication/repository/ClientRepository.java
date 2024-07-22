package com.pranab.ClientApplication.repository;

import com.pranab.ClientApplication.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
