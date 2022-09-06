package useCases;

import java.util.Scanner;

import employee.employee;
import employeeDAO.employeeDAOImpl;
import exception.EmployeeException;

public class updateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the empid");
		
		int id = sc.nextInt();
		
		System.out.println("enter the employee name");
		
		String name = sc.next();
		
		System.out.println("enetr the address");
		
		String address = sc.next();
		
		System.out.println("enter the salary");
		
		int salary = sc.nextInt();
		
		
		employee emp = new employee(id, name, address, salary);
		
		
		employeeDAOImpl empimpl = new employeeDAOImpl();
		
		try {
			empimpl.updateEmployee(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
