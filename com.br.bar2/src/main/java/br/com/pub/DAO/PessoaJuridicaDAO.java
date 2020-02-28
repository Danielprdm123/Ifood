package br.com.pub.DAO;

import java.time.LocalDate;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Mesa;
import br.com.pub.model.Pessoa_Juridica;

public class PessoaJuridicaDAO {
	
	public void setPJ() {
	Pessoa_Juridica pessoa_j = new Pessoa_Juridica();
    pessoa_j.setNome("Daniela");
    pessoa_j.setEndereco("Rua michela thomo 155");
    pessoa_j.setFone("67991505454");
    pessoa_j.setDatanasc(LocalDate.now());
    pessoa_j.setDt_cadastro(LocalDate.now());
    pessoa_j.setCnpj(12345);;
    pessoa_j.setIe("ola mundo");
    GenericDAO<Pessoa_Juridica> pjdao = new GenericDAO<Pessoa_Juridica>();
    pjdao.novo(pessoa_j);
    
	}
}
