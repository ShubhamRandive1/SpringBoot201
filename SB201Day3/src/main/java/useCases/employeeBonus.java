package useCases;

import java.util.Scanner;

import empDAO.employeeDAO;

public class employeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeeDAO empD = new employeeDAO();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the employee id");
		
		int empid = sc.nextInt();
		
		
		System.out.println("enter the bonus amount");
		
		int bonus = sc.nextInt();
		
		
		String str = empD.giveBonusToEmployee(empid, bonus);
		
		System.out.println(str);

	}

}
