package com.ada.inadimplentes.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.ada.inadimplentes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface InadimplentesRepository extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente> {

    Page<Cliente> findAll(Pageable pageable);
}
