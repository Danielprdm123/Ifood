package app;
import java.time.LocalDate;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pub.DAO.ItemVendaDAO;
import br.com.pub.DAO.UsuarioDAO;
import br.com.pub.DAO.VendasDAO;




public class Main {
	public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
        EntityManager manager = factory.createEntityManager();
        
        
        
        UsuarioDAO u = new UsuarioDAO();
        u.setU();
        
        VendasDAO v =new VendasDAO();
        v.setV();
        
        
        
        ItemVendaDAO i = new ItemVendaDAO();
        i.setI();
        
    }

}
 