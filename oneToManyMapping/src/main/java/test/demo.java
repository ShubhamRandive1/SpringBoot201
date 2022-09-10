package test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import entity.collage;
import entity.student;
import utility.EntityManUtility;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EntityManUtility.provideEntityManager();
		
		em.getTransaction().begin();
		
		collage cc = new collage();
		
		cc.setCollageAddress("Mumbai");
		cc.setCollageName("JPA_OneToMany");
		 
		student stu1 = new student();
		
		stu1.setStudentName("Ram");
		stu1.setMobileNumber(808080);
		stu1.setStudentEmail("pqs@gmail.com");
		stu1.setClg(cc);
		
		
		student stu2 = new student();
		
		stu2.setMobileNumber(909090);
		stu2.setStudentEmail("rst@gmail.com");
		stu2.setStudentName("Raju");
		stu2.setClg(cc);
		
		
		Set<student> st = new HashSet<>();
		
		st.add(stu1);
		st.add(stu2);
		
		
		cc.setStu(st);
		em.persist(cc);
		em.getTransaction().commit();
		
		
		em.getTransaction().begin();
		collage ccc = em.find(collage.class, 1);
		System.out.println("collage is :"+ccc.getCollageName());
		
		
		Set<student> ssss = ccc.getStu();
		
		for(student stu_clg : ssss) {
			
			System.out.println(stu_clg.getStudentName());
			System.out.println(stu_clg.getStudentRoll());
			System.out.println(stu_clg.getMobileNumber());
			System.out.println(stu_clg.getStudentEmail());
		}
		
		
		em.getTransaction().commit();
		
		em.close();
		em.close();

	}

}
