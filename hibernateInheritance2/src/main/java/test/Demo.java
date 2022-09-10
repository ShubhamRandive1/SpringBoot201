package test;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import entity.Course;
import entity.Student;
import utility.EntityManUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EntityManUtil.provideConnection();
		
		
		Course cc = new Course();
		
		cc.setCourseName("SpringBoot");
		cc.setDuration(2);
		cc.setFee(3500);
		
		
		Course cc2 = new Course();
		
		cc2.setCourseName("JDBC");
		cc2.setDuration(1);
		cc2.setFee(1500);
		
		
		Course cc3 = new Course();
		
		cc3.setCourseName("JPQL");
		cc3.setDuration(2);
		cc3.setFee(1000);
		
		
		Course cc4 = new Course();
		
		cc4.setCourseName("Hibernate");
		cc4.setDuration(2);
		cc4.setFee(4000);
		
		Course cc5 = new Course();
		
		cc5.setCourseName("Maven");
		cc5.setDuration(2);
		cc5.setFee(2500);
		
		
		Student ss = new Student();
		
		ss.setName("Raju");
		ss.setEmail("abcd@efg.com");
		ss.setMobile(909090909);
		
		
		Student ss2 = new Student();
		
		ss2.setName("baburao");
		ss2.setEmail("asd@jssjdf");
		ss2.setMobile(397970797);
		
		Student ss3 = new Student();
		
		ss3.setName("shayam");
		ss3.setEmail("werwr@fdf");
		ss3.setMobile(9090909);
		
		Student ss4 = new Student();
		
		ss4.setName("kabira");
		ss4.setEmail("sgtrtd@tyrty");
		ss4.setMobile(899009);
		
		Student ss5 = new Student();
		
		ss5.setName("anuradha");
		ss5.setEmail("sasd@kdsdf");
		ss5.setMobile(9809890);
		
		
		ss.getCourse().add(cc);
		
		cc.getStu().add(ss);
		
		ss2.getCourse().add(cc);
		
		cc2.getStu().add(ss2);
		
		ss3.getCourse().add(cc3);
		
		cc3.getStu().add(ss3);
		
		ss4.getCourse().add(cc4);
		
		cc4.getStu().add(ss4);
		
		ss5.getCourse().add(cc5);
		
		cc5.getStu().add(ss5);
		
		em.getTransaction().begin();
		
		em.persist(ss);
		em.persist(ss2);
		em.persist(ss3);
		em.persist(ss4);
		em.persist(ss5);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done.....");
		

	}

}
