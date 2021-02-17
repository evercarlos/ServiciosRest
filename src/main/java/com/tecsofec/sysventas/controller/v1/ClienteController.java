package com.tecsofec.sysventas.controller.v1;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecsofec.sysventas.config.RestTecsofec;
import com.tecsofec.sysventas.model.Cliente;
import com.tecsofec.sysventas.service.ClienteService;

@RestController
@RequestMapping(value = "/api/v1/cliente", produces = "application/json")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<?> findAllCliente(HttpServletRequest request){
		List<Cliente> cliente= clienteService.findAll();
		return new ResponseEntity<>(cliente,HttpStatus.OK);
	}
	
	/*CREAR CLIENTE*/
	@PostMapping //@RequestBody Cliente cliente :: MAPEADOR
	public ResponseEntity<?> createCliente(@RequestBody Cliente cliente,HttpServletRequest request){
		
		cliente.setEstado(true);
		clienteService.save(cliente);
		
		return new ResponseEntity<>(cliente,HttpStatus.OK);//HttpStatus.OK:: status 200
	}
	
	@PutMapping
	public ResponseEntity<?> updateCliente(@RequestBody Cliente cliente, HttpServletRequest request){
		
		Cliente tmp = clienteService.findById(cliente.getId());
		if(tmp!=null) {
			cliente.setEstado(true);
			clienteService.update(cliente);
		}else {
		   return new ResponseEntity<>(new RestTecsofec("No existe el cliente"),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(cliente,HttpStatus.OK);	
	}
	
	@GetMapping("/{idCliente}")
	public ResponseEntity<?> findByCliente(
			@PathVariable(value = "idCliente") Integer idCliente,
			HttpServletRequest request
			){
		
		Cliente cliente= clienteService.findById(idCliente);
		if(cliente==null) {
			  return new ResponseEntity<>(new RestTecsofec("No existe el cliente"),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(cliente,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{idCliente}")
	public ResponseEntity<?> deleteCliente(
     @PathVariable(value = "idCliente") Integer idCliente,
     HttpServletRequest request
    ){
		Cliente cliente= clienteService.findById(idCliente);
		if(cliente==null) {
			return new ResponseEntity<>(new RestTecsofec("No existe el cliente"),HttpStatus.NOT_FOUND);
		}
		cliente.setEstado(false);
		clienteService.delete(cliente);
		return new ResponseEntity<>(cliente,HttpStatus.OK);
	}
	
}





