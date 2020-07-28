package pe.edu.upeu.Cliente.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Cliente.dao.Clientedao;
import pe.edu.upeu.Cliente.entity.Cliente;
   @Repository
public class Clientedaoimp implements Clientedao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM cliente",BeanPropertyRowMapper.newInstance(Cliente.class));
	}
	
	

}
