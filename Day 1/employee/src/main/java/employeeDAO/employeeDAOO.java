package employeeDAO;

import employee.employee;
import exception.EmployeeException;

public interface employeeDAOO {
	
	
	public employee registerEmployee(employee emp)throws EmployeeException;
	
	
	public employee getEmployeeById(int empid)throws EmployeeException;
	
	
	public employee deleteEmployeeById(int empid)throws EmployeeException;
	
	
	public employee updateEmployee(employee emp)throws EmployeeException;
	
	

}
