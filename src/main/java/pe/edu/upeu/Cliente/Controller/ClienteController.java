package pe.edu.upeu.Cliente.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.Cliente.entity.Cliente;
import pe.edu.upeu.Cliente.service.Clienteservice;




@RestController
public class ClienteController {
	
	@Autowired
	private Clienteservice clienteservice;
	@GetMapping("/h")
	public List<Cliente> readAll(){
		return clienteservice.readAll();
	}
	

}
