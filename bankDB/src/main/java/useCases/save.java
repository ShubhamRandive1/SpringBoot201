package useCases;

import java.util.Scanner;

import Account.Account;
import DAO.accountImplDao;
import DAO.accountInterface;

public class save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		accountImplDao acc = new accountImplDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		
		int id = sc.nextInt();
		
		System.out.println("enter email");
		
		String email = sc.next();
		
		
		System.out.println("enter address");
		
		String address = sc.next();
		
		System.out.println("enter balance");
		
		double bal = sc.nextDouble();
		
		Account ac = new Account(id, email, address, bal);
		
		acc.save(ac);
		
	

	}

}
