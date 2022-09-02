package useCases;

import java.util.Scanner;

import empDAO.employeeDAO;

public class addressOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeeDAO empD = new employeeDAO();
		
		Scanner sc = new Scanner(System.in);
		
		
		int empid = sc.nextInt();
		
		
		String address = empD.getAddressOfEmployee(empid);
		
		if(address != "") {
			
			System.out.println("Address of Employee with id : "+empid+" "+ "lives in: " + address);
			
		}else {
			
			System.out.println("employee with id: "+empid+" does not exist");
		}

	}

}
