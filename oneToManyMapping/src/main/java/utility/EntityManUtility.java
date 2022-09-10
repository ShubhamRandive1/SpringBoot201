package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManUtility {
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("collage");
		
		
	}
	
	public static EntityManager provideEntityManager() {
		
		return emf.createEntityManager();
	}

}
