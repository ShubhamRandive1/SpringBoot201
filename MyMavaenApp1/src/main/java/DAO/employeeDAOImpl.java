package DAO;

import java.util.ArrayList;

import Employeeexception.EmployeeException;
import employee.empBean;

public interface employeeDAOImpl {
	
	public ArrayList<empBean> getAllEmployee() throws EmployeeException;
	
	public String getAddressOfEmployee (int empid)throws EmployeeException;
	
	public String giveBonusToEmployee(int empid , int bonus)throws EmployeeException;
	
	public String[] getNameAndAddress(int empid)throws EmployeeException;

}
