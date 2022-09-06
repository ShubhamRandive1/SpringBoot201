package useCases;

import java.util.Scanner;

import employee.employee;
import employeeDAO.employeeDAOImpl;
import exception.EmployeeException;

public class deleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the empid");
		
		int empid = sc.nextInt();
		
		employeeDAOImpl empimpl = new employeeDAOImpl();
		
		try {
			empimpl.deleteEmployeeById(empid);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
