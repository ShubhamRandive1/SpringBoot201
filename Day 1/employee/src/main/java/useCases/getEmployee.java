package useCases;

import java.util.Scanner;

import employeeDAO.employeeDAOImpl;
import exception.EmployeeException;

public class getEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the empid");
		
		int id = sc.nextInt();
		
		employeeDAOImpl empimpl = new employeeDAOImpl();
		
		
		try {
			empimpl.getEmployeeById(id);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
