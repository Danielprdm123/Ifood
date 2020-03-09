package br.com.pub.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Cliente;
import br.com.pub.model.ItemVenda;
import br.com.pub.model.Mesa;
import br.com.pub.model.Vendas;

@ManagedBean(name ="VendasBean")
@SessionScoped
public class VendasController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Vendas vendas = new Vendas();
	List<ItemVenda> item= new ArrayList<ItemVenda>();
	public Vendas getVendas() {
		return vendas;
	}
	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}
	public List<ItemVenda> getItem() {
		return item;
	}
	public void setItem(List<ItemVenda> item) {
		this.item = item;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	Cliente cliente = new Cliente();
	Mesa mesa = new Mesa();
	
	public void addVendas() {
		GenericDAO<Vendas> vendasDAO = new GenericDAO<Vendas>();
		GenericDAO<Cliente> clienteDAO = new GenericDAO<Cliente>();
		GenericDAO<Mesa> mesaDAO = new GenericDAO<Mesa>();

		
	}
}
