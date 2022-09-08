package main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import entity.Address;
import entity.Employee;
import utiility.EntityManUtil;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter emp gender");
		
		String gender = sc.next();
		
		System.out.println("enter emp name");
		
		String name = sc.next();
		
		System.out.println("enter emp salary");
		
		int salary = sc.nextInt();
		
		System.out.println("enter home address");
		
		System.out.println("enter home state");
		
		String home_state = sc.next();
		
		System.out.println("enter home city");
		
		String home_city = sc.next();
		
		System.out.println("enter home pincode");
		
		String home_pincode = sc.next();
		
		System.out.println("enter type ");
		
		String home_type = sc.next();
		
		
		EntityManager em = EntityManUtil.provideEntityManager();
		
		
		Employee emp = new Employee();
		
		emp.setGender(gender);
		
		emp.setName(name);
		
		emp.setSalary(salary);
		
		
		System.out.println("enter office address");
		
		System.out.println("enter office state");
		
		String office_state = sc.next();
		
		System.out.println("enter office city");
		
		String office_city = sc.next();
		
		System.out.println("enter office pincode");
		
		String office_pincode = sc.next();
		
		System.out.println("enter type ");
		
		String office_type = sc.next();
		
		
		Address home_address = new Address(home_state, home_city, home_pincode, home_type);
		
		Address office_address = new Address(office_state, office_city, office_pincode, office_type);
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done....");
		
		

	}

}
