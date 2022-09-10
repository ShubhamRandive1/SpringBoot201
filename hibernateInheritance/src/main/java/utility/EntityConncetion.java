package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityConncetion {
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("employee");
	}
	
	public static EntityManager provideConnectionManager() {
		
		return emf.createEntityManager();
	}

}
