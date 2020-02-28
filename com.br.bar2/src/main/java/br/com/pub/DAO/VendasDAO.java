package br.com.pub.DAO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Cliente;
import br.com.pub.model.ItemVenda;
import br.com.pub.model.Mesa;
import br.com.pub.model.Pessoa_Fisica;
import br.com.pub.model.Vendas;

public class VendasDAO {
	
	
	public void setV(){
		Vendas venda = new Vendas();
		GenericDAO<Vendas> vdao = new GenericDAO<Vendas>();
		List<ItemVenda> itemVenda = new ArrayList<ItemVenda>();
		Pessoa_Fisica cliente = new Pessoa_Fisica();
		cliente.setNome("Daniel");
		cliente.setEndereco("Rua michel thome 155");
		cliente.setFone("67991505747");
		cliente.setDatanasc(LocalDate.now());
		cliente.setDt_cadastro(LocalDate.now());
		cliente.setCpf(1234);
		cliente.setRg(12345);
		Mesa mesa = new Mesa();
		mesa.setNumero(10);
		mesa.setStatus(true);
		
		venda.setCliente(cliente);
		venda.setData(LocalDate.now());
		venda.setHora(LocalTime.now());
		venda.setMesa(mesa);
		venda.setItemvenda(itemVenda);
		venda.setTotalVenda(1000);
		vdao.novo(venda);
	}

}
