package br.com.pub.DAO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Cliente;
import br.com.pub.model.ItemVenda;
import br.com.pub.model.Mesa;
import br.com.pub.model.Vendas;

public class VendasDAO {
	
	
	public void setV(){
		Vendas venda = new Vendas();
		GenericDAO<Vendas> vdao = new GenericDAO<Vendas>();
		List<ItemVenda> itemVenda = new ArrayList<ItemVenda>();
		Cliente cliente = new Cliente();
		Mesa mesa = new Mesa();
		
		venda.setCliente(cliente);
		venda.setData(LocalDate.now());
		venda.setHora(LocalTime.now());
		venda.setMesa(mesa);
		venda.setItemvenda(itemVenda);
		venda.setTotalVenda(1000);
		vdao.novo(venda);
	}

}
