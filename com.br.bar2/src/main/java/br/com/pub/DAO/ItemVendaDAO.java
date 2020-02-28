package br.com.pub.DAO;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.ItemVenda;
import br.com.pub.model.Produto;

public class ItemVendaDAO {
	
	public void setI() {
	  ItemVenda itensVenda = new ItemVenda();
	  GenericDAO<ItemVenda> idao = new GenericDAO<ItemVenda>();
	  Produto prod = new Produto();
	  
	  itensVenda.setProduto(prod);
	  itensVenda.setQtd(10);
	  idao.novo(itensVenda);
	}

	
}
