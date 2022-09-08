package empDAO;

import java.util.List;

import Employee.employee;

public interface employeeDAOImpl {
	
	public List<employee> getAllEmployee();
	
	
	public String getAddressOfEmployee(int empId);
	
	
	public String giveBonusToEmployee(int empId, int Bonus);
	
	
	public String[] getNameAndAddress(int empId);

}
