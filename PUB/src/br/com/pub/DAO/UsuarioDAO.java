package br.com.pub.DAO;

import java.time.LocalDate;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Usuario;

public class UsuarioDAO {
	
	
	public void setU(){
		Usuario usuario = new Usuario();
		GenericDAO<Usuario> udao = new GenericDAO<Usuario>();
		
		usuario.setNome("User");
		usuario.setFone("6790909090");
		usuario.setEndereco("Rua dos testes");
		usuario.setDatanasc(LocalDate.now());
		usuario.setLogin("user");
		usuario.setSenha("123");
		udao.novo(usuario);
	}

}
