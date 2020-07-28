package pe.edu.upeu.Cliente.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Cliente.dao.Clientedao;
import pe.edu.upeu.Cliente.entity.Cliente;
import pe.edu.upeu.Cliente.service.Clienteservice;
   @Service
public class Clienteserviceimp implements Clienteservice{
    
	@Autowired
	private Clientedao clientedao;
	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clientedao.readAll();
	}
	
	
}
