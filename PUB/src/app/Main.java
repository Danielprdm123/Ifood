package app;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Mesa;
import br.com.pub.model.Pessoa_Fisica;
import br.com.pub.model.Pessoa_Juridica;

public class Main {
	public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
        EntityManager manager = factory.createEntityManager();
        
        Pessoa_Fisica pessoa_f = new Pessoa_Fisica();
        pessoa_f.setNome("Daniel");
        pessoa_f.setEndereco("Rua michel thome 155");
        pessoa_f.setFone("67991505747");
        pessoa_f.setDatanasc(LocalDate.now());
        pessoa_f.setDt_cadastro(LocalDate.now());
        pessoa_f.setCpf(1234);
        pessoa_f.setRg(12345);
        GenericDAO<Pessoa_Fisica> salvador = new GenericDAO<Pessoa_Fisica>();
        salvador.novo(pessoa_f);
        //////////
        
        
        Pessoa_Juridica pessoa_j = new Pessoa_Juridica();
        pessoa_j.setNome("Daniela");
        pessoa_j.setEndereco("Rua michela thomo 155");
        pessoa_j.setFone("67991505454");
        pessoa_j.setDatanasc(LocalDate.now());
        pessoa_j.setDt_cadastro(LocalDate.now());
        pessoa_j.setCnpj(12345);;
        pessoa_j.setIe("ola mundo");
        GenericDAO<Pessoa_Juridica> salvadora = new GenericDAO<Pessoa_Juridica>();
        salvadora.novo(pessoa_j);
        
        GenericDAO<Mesa> m = new GenericDAO<Mesa>();
        
    }

}
 