package br.com.pub.controller;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Produto;

@ManagedBean(name = "produtoBean")
@SessionScoped
public class ProdutoController implements Serializable{
	

	private static final long serialVersionUID = 1L;
	Produto prod = new Produto();

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}
	
	public void addProduto(){
	
		GenericDAO<Produto> produtoDAO = new GenericDAO<Produto>();
		produtoDAO.novo(prod);
		
	}

}
