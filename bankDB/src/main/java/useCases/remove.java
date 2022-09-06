package useCases;

import java.util.Scanner;

import DAO.accountImplDao;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		accountImplDao ac = new accountImplDao();
		
		System.out.println("enter id");
		
		int id = sc.nextInt();
		
		
		ac.remove(id);

	}

}
