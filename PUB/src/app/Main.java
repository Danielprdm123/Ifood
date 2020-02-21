package app;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Mesa;

public class Main {
	public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
        EntityManager manager = factory.createEntityManager();

        GenericDAO<Mesa> m = new GenericDAO<Mesa>();
    }

}
 