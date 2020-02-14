package br.com.model;

import java.time.LocalDate;
import java.util.List;

public class Vendas {
  private long id;
  private LocalDate data;
  private double totalVenda;
  private Mesa mesa;
  private Cliente cliente;
  private List<ItemVenda>itemvenda;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public LocalDate getData() {
	return data;
}
public void setData(LocalDate data) {
	this.data = data;
}
public double getTotalVenda() {
	return totalVenda;
}
public void setTotalVenda(double totalVenda) {
	this.totalVenda = totalVenda;
}
public Mesa getMesa() {
	return mesa;
}
public void setMesa(Mesa mesa) {
	this.mesa = mesa;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public List<ItemVenda> getItemvenda() {
	return itemvenda;
}
public void setItemvenda(List<ItemVenda> itemvenda) {
	this.itemvenda = itemvenda;
} 
}
