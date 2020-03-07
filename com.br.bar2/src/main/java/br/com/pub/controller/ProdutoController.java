package br.com.pub.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.model.Produto;

@ManagedBean(name = "produtoBean")
@SessionScoped
public class ProdutoController {
	Produto prod = new Produto();

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

}
