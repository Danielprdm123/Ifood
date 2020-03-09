package br.com.pub.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Pessoa_Fisica;


@ManagedBean(name = "PessoaFBean")
@SessionScoped
public class PessoaFisicaController implements Serializable{

	private static final long serialVersionUID = 1L;
	Pessoa_Fisica pessoaf = new Pessoa_Fisica();
	public Pessoa_Fisica getPessoaf() {
		return pessoaf;
	}
	public void setPessoaf(Pessoa_Fisica pessoaf) {
		this.pessoaf = pessoaf;
	}
	public void addPessoaFisica() {
		GenericDAO<Pessoa_Fisica> pessoaDAO = new GenericDAO<Pessoa_Fisica>();
		pessoaDAO.novo(pessoaf);
		
	}

}
