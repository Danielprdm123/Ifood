package br.com.pub.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Pessoa_Fisica;
import br.com.pub.model.Usuario;

@ManagedBean(name = "UsuarioBean")
@SessionScoped
public class UsuarioController implements Serializable{
	private static final long serialVersionUID = 1L;
	Usuario usuario= new Usuario();
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	} 
	
	public void addUsuario() {
		GenericDAO<Usuario> pessoaDAO = new GenericDAO<Usuario>();
		pessoaDAO.novo(usuario);
		
	}

}
