package useCases;

import java.util.Scanner;

import DAO.accountImplDao;

public class withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accountImplDao ac = new accountImplDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter accountid");
		
		int accountid = sc.nextInt();
		
		System.out.println("enter amount");
		
		double amount = sc.nextDouble();
		
		ac.withdraw(amount, accountid);
		

	}

}
