package br.com.pub.controller;


import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Produto;

@ManagedBean(name = "produtoBean")
@SessionScoped
public class ProdutoController implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private Produto prod = new Produto();
	GenericDAO<Produto> produtoDAO = new GenericDAO<Produto>();

	
	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}
	
	public String addProduto(){
	
		GenericDAO<Produto> produtoDAO = new GenericDAO<Produto>();
		if(prod != null) {

		produtoDAO.novo(prod);
		FacesContext.getCurrentInstance().addMessage("msg: ok", FacesMessage("Salvo com sucesso"));
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		return "sucesso !";
		}
		else {
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(""));
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			return "erro";
		}
	}
	public List<Produto> listarProduto(){
		return produtoDAO.litarTodos(Produto.id);
	}
	public String delProduto() {
		if(prod != null) {

			produtoDAO.deletar(prod);
			FacesContext.getCurrentInstance().addMessage("msg: ok", FacesMessage("Produto Deletado"));
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			return "sucesso !";
			}
		return"";
	}

}
