package com.tecsofec.sysventas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsofec.sysventas.model.Cliente;

@Repository
public interface ClienteRepository  extends CrudRepository<Cliente, Integer>{
 
	@Query("SELECT C FROM Cliente C WHERE C.estado=true")
	List<Cliente> findAll();
}
