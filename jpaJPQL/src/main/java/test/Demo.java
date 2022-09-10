package test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Address;
import entity.Customer;
import utility.EntityManUtility;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EntityManUtility.provideConnection();
		
		
		em.getTransaction().begin();
		
		Address add = new Address();
		
		add.setCity("Delhi");
		add.setPincode("2342342");
		add.setState("MP");
		
		
		Address add2 = new Address();
		
		add2.setCity("mumbai");
		add2.setPincode("0807786");
		add2.setState("MH");
		
		List<Address> aa = new ArrayList<>();
		
		aa.add(add);
		
		List<Address> aa2 = new ArrayList<>();
		
		aa2.add(add2);
		
		
		Customer cc = new Customer();
		
		
		cc.setEmail("jkh@lh.com");
		
		cc.setMobileNumber(900910);
		
		cc.setName("Raju");
		
		
		Customer cc2 = new Customer();
		
		
		cc2.setEmail("lku@lkj.com");
		
		cc2.setMobileNumber(90909);
		
		cc2.setName("BabuRao");
		
		
		cc.getAddress().add(add2);
		cc2.getAddress().add(add);
		
		em.persist(cc);
		
		em.persist(cc2);
		
		
		em.getTransaction().commit();
		
		String jpql = "select name,address,email,mobilenumber from Customer";
		
		
		Query sql = em.createQuery(jpql);
		
		List<Object[]> res = sql.getResultList();
		
		for(Object[] or : res) {
			
			String name = (String) or[0];
			String addrersss = (String) or[1];
			String email = (String) or[2];
			int mob = (int) or[3];
			
			System.out.println(name);
			System.out.println(addrersss);
			System.out.println(email);
			System.out.println(mob);
			
		}

	}

}
