package DBConnect;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("employeeData");
		
		
	}
	
	public static EntityManager provideEntityManager() {
		
		EntityManager em = emf.createEntityManager();
		
		return em;
	}

}
