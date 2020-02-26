package br.com.pub.DAO;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Mesa;

public class MesaDAO {
	public void setM() {
		Mesa mesa = new Mesa();
		GenericDAO<Mesa> mdao = new GenericDAO<Mesa>();
		
		mesa.setNumero(10);
		mesa.setStatus(true);
	}

}
