package empDAOConn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class empDaoConn {
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("employee");
		
		
	}
	
	public static EntityManager provideEntityManager() {
		
		EntityManager em = emf.createEntityManager();
		
		return em;
		
	}

}
