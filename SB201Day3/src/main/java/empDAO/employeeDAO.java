package empDAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DBConnect.DBConnection;
import Employee.employee;

public class employeeDAO implements employeeDAOImpl{
	

	@Override
	public List<employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		EntityManager em = DBConnection.provideEntityManager();
		
		
		Query emplist = em.createQuery("select * from employee");
		
		
		List<employee> names = (List<employee>)emplist.getResultList();
		
		
		return names;
		
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		// TODO Auto-generated method stub
		
		String str = "";
		
		EntityManager em = DBConnection.provideEntityManager();
		
		employee emp = em.find(employee.class, empId);
		
		if(emp != null) {
			
			str = emp.getAddress();
		}else {
			
			str = "";
		}
		
		
		
		return str;
	}

	@Override
	public String giveBonusToEmployee(int empId, int Bonus) {
		// TODO Auto-generated method stub
		
		String str = "";
		
		EntityManager em = DBConnection.provideEntityManager();
		
		employee emp = em.find(employee.class, empId);
		
		if(emp != null) {
			
			em.getTransaction().begin();
			
			emp.setSalary(emp.getSalary()+Bonus);
			
			em.getTransaction().commit();
			
			str = "bonus added";
			
		}else {
			
			str = "something went wrong";
		}
		
		
		return str;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		// TODO Auto-generated method stub
		
		String[] nameAndAddress = new String[2];
		
		
		EntityManager em = DBConnection.provideEntityManager();
		
		employee emp = em.find(employee.class, empId);
		
		
		if(emp != null) {
			
			
			nameAndAddress[0] = emp.getName();
			
			nameAndAddress[1] = emp.getAddress();
		}
		
		return nameAndAddress;
	}
	
	
	
	 

}
