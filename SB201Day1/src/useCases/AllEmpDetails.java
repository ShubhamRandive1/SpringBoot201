package useCases;

import DAO.EmployeeDAO;
import DAO.employeeDAOImpl;
import Employeeexception.EmployeeException;

public class AllEmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO emp = new EmployeeDAO();
		
		try {
			emp.getAllEmployee();
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
