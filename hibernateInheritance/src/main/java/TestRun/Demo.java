package TestRun;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import entity.Address;
import entity.Employee;
import utility.EntityConncetion;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		EntityManager em = EntityConncetion.provideConnectionManager();
		
		
		Address a1 = new Address("MH","Nashik","89898" );
		Address a2 = new Address("GJ", "Surat", "890978");
		Address a3 = new Address("UP", "Patna", "76789");
		Address a4 = new Address("Karnataka", "Chennai", "078907");
		
		
		Employee ep = new Employee();
		
		ep.setHome_Address(a1);
		ep.setOffice_Address(a4);
		ep.setName("BabuRao");
		ep.setSalary(80000);
		
		Employee ep2 = new Employee();
		
		ep2.setHome_Address(a2);
		ep2.setOffice_Address(a3);
		ep2.setName("Raju");
		ep2.setSalary(90000);
		
		
		Employee ep3 = new Employee();
		
		ep3.setHome_Address(a4);
		ep3.setOffice_Address(a2);
		ep3.setName("Shayam");
		ep3.setSalary(70000);
		
		Employee ep4 = new Employee();
		
		ep4.setHome_Address(a3);
		ep4.setOffice_Address(a1);
		ep4.setName("Kabira");
		ep4.setSalary(85000);
		
		em.getTransaction().begin();
		
		em.persist(ep);
		em.persist(ep2);
		em.persist(ep3);
		em.persist(ep4);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done....");
		
	}

}
