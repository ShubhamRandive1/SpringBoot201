package useCases;

import java.util.Scanner;

import DAO.EmployeeDAO;
import Employeeexception.EmployeeException;

public class getNameAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter employee id");
		
		int eid = sc.nextInt();
		
		EmployeeDAO emp = new EmployeeDAO();
		
		try {
			emp.getNameAndAddress(eid);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
