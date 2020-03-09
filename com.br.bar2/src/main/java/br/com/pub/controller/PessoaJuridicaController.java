package br.com.pub.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Pessoa_Juridica;

@ManagedBean(name = "PessoaJBean")
@SessionScoped
public class PessoaJuridicaController implements Serializable{

	private static final long serialVersionUID = 1L;
	Pessoa_Juridica pessoaJ = new Pessoa_Juridica();
	
	
	public Pessoa_Juridica getPessoaJ() {
		return pessoaJ;
	}
	public void setPessoaJ(Pessoa_Juridica pessoaJ) {
		this.pessoaJ = pessoaJ;
	}
	
	public void addPessoaJudica() {
		GenericDAO<Pessoa_Juridica> pessoaDAO = new GenericDAO<Pessoa_Juridica>();
		pessoaDAO.novo(pessoaJ);
		
	}
	

}
