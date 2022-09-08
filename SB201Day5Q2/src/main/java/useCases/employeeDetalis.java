package useCases;

import java.util.List;

import Employee.employee;
import empDAO.employeeDAO;

public class employeeDetalis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeeDAO empD = new employeeDAO();
		
		List<employee> emp = empD.getAllEmployee();
		
		
		for(employee i : emp) {
			
			System.out.println(i);
		}

	}

}
