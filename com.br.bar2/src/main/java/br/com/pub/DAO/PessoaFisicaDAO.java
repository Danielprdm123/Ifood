package br.com.pub.DAO;

import java.time.LocalDate;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Pessoa_Fisica;

public class PessoaFisicaDAO {
	 
	
	 
	 public void setPF() {
	 Pessoa_Fisica pessoa_f = new Pessoa_Fisica();
	 GenericDAO<Pessoa_Fisica> pfdao = new GenericDAO<Pessoa_Fisica>();
     
	 pessoa_f.setNome("Daniel");
     pessoa_f.setEndereco("Rua michel thome 155");
     pessoa_f.setFone("67991505747");
     pessoa_f.setDatanasc(LocalDate.now());
     pessoa_f.setDt_cadastro(LocalDate.now());
     pessoa_f.setCpf(1234);
     pessoa_f.setRg(12345);
     pfdao.novo(pessoa_f);
	}

}
