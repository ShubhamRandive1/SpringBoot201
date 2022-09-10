package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManUtil {
	
	public static EntityManagerFactory emf;
	
	static {
		
		emf = Persistence.createEntityManagerFactory("student");
		
	}
	
	public static EntityManager provideConnection() {
		
		return emf.createEntityManager();
	}

}
