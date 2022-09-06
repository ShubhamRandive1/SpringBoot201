package DAOConn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class bankDAOConn {
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf= Persistence.createEntityManagerFactory("account");
		
		
	}
	
	public static EntityManager proviEntityManager() {
		
		EntityManager em = emf.createEntityManager();
		
		return em;
	}

}
