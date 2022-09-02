package useCases;

import java.util.Scanner;

import empDAO.employeeDAO;

public class employeeNameAndAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		employeeDAO empD = new employeeDAO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter emp id");
		
		int empid = sc.nextInt();
		
		String[] str1 = empD.getNameAndAddress(empid);
		
		if(str1 != null) {
			
			System.out.println("Name of the Employee is: "+str1[0]);
			
			System.out.println("Address of the employee is:"+str1[1]);
		}else {
			
			System.out.println("employee does not exist with id: "+empid);
		}

	}

}
