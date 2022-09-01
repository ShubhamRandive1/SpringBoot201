package useCases;

import java.util.Scanner;

import DAO.EmployeeDAO;
import Employeeexception.EmployeeException;

public class getBonusSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the employee id");
		
		int id = sc.nextInt();
		
		System.out.println("enter the bonus");
		
		int bonus = sc.nextInt();
		
		EmployeeDAO emp = new EmployeeDAO();
		
		try {
			emp.giveBonusToEmployee(id, bonus);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
