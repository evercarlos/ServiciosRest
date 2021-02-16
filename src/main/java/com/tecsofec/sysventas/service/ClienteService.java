package com.tecsofec.sysventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsofec.sysventas.model.Cliente;
import com.tecsofec.sysventas.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public void update(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	
	public void delete(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public Cliente findById(Integer id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
}



