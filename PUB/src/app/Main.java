package app;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pub.DAO.ItemVendaDAO;
import br.com.pub.DAO.MesaDAO;
import br.com.pub.DAO.PessoaFisicaDAO;
import br.com.pub.DAO.PessoaJuridicaDAO;
import br.com.pub.DAO.UsuarioDAO;
import br.com.pub.DAO.VendasDAO;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Mesa;
import br.com.pub.model.Pessoa_Fisica;
import br.com.pub.model.Pessoa_Juridica;

public class Main {
	public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
        EntityManager manager = factory.createEntityManager();
        
        PessoaFisicaDAO pf = new PessoaFisicaDAO();
        pf.setPF();
        
        PessoaJuridicaDAO pj = new PessoaJuridicaDAO();
        pj.setPJ();
        
        UsuarioDAO u = new UsuarioDAO();
        u.setU();
        
        VendasDAO v =new VendasDAO();
        v.setV();
        
        MesaDAO m = new MesaDAO();
        m.setM();
        
        ItemVendaDAO i = new ItemVendaDAO();
        i.setI();
        
    }

}
 