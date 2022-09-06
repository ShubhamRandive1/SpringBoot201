package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import Account.Account;
import DAOConn.bankDAOConn;

public class accountImplDao implements accountInterface{

	@Override
	public  Account findById(int id) {
		// TODO Auto-generated method stub
		
		Account acc = null;
		
		EntityManager em = bankDAOConn.proviEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		acc = em.find(Account.class, id);
		
		System.out.println("Id : "+ acc.getId());
		System.out.println("Email :"+acc.getEmail());
		System.out.println("address :"+acc.getAddress());
		System.out.println("balance :"+acc.getBalance());
		
		em.getTransaction().commit();
		
		em.close();
		
		
		return acc;
	}

	@Override
	public String save(Account account) {
		// TODO Auto-generated method stub
		String str = "";
		
		EntityManager em = bankDAOConn.proviEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Account acc = new Account(70, "Ram", "Delhi", 80000);
		
		em.persist(acc);
		
		em.getTransaction().commit();
		
		em.close();
		
		str += acc.getAddress();
		str+= acc.getEmail();
		
		str += "successful";
		
		
		return str;
	}

	@Override
	public String update(Account account) {
		// TODO Auto-generated method stub
		String str = "";
		
		EntityManager em = bankDAOConn.proviEntityManager();
		
		Account acc = em.find(Account.class, 1);
		
		System.out.println("Id : "+ acc.getId());
		System.out.println("Email :"+acc.getEmail());
		System.out.println("address :"+acc.getAddress());
		System.out.println("balance :"+acc.getBalance());
		
		acc.setId(5);
		acc.setEmail("abc@ABC.com");
		acc.setAddress("Mumbai");
		acc.setBalance(90000);
		
		
		str += acc.getAddress();
		
		str += acc.getEmail();
		
		str+="successful";
		
		return str;
	}

	@Override
	public String remove(int id) {
		// TODO Auto-generated method stub
		
		String str = "";
		
		EntityManager em = bankDAOConn.proviEntityManager();
		
		em.getTransaction().begin();
		
		Account acc = em.find(Account.class, id);
		
		System.out.println("Id : "+ acc.getId());
		System.out.println("Email :"+acc.getEmail());
		System.out.println("address :"+acc.getAddress());
		System.out.println("balance :"+acc.getBalance());
		
		str += acc.getAddress();
		str += acc.getEmail();
		
		
		em.remove(acc);
		
		em.getTransaction().commit();
		em.close();
		
		
		return str;
	}

	@Override
	public String withdraw(double amount, int accountId) {
		// TODO Auto-generated method stub
		
		String str = "";
		
		EntityManager em = bankDAOConn.proviEntityManager();
		
		Account acc = em.find(Account.class, accountId);
		
		em.getTransaction().begin();
		
		acc.setBalance(acc.getBalance()-amount);
		
		em.getTransaction().commit();
		
		em.close();
		
		str +="withdraw successful";
		
		return str;
	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		
		
		String str = "";
		
		EntityManager em = bankDAOConn.proviEntityManager();
		
		Account acc = em.find(Account.class, accountId);
		
		
		em.getTransaction().begin();
		
		acc.setBalance(acc.getBalance()+amount);
		
		em.getTransaction().commit();
		
		em.close();
		
		str += "deposit successful";
		
		return null;
	}
	
	
	

}
