package employeeDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jboss.jandex.ThrowsTypeTarget;

import empDAOConn.empDaoConn;
import employee.employee;
import exception.EmployeeException;

public class employeeDAOImpl implements employeeDAOO{

	@Override
	public employee registerEmployee(employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		EntityManager em = empDaoConn.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		flag = true;
		
		em.getTransaction().commit();
		
		em.close();
		
		if(flag) {
			
			return emp;
			
		}else {
			
			throw new EmployeeException("employee not added");
		}
	
		
	}

	@Override
	public employee getEmployeeById(int empid) throws EmployeeException {
		// TODO Auto-generated method stub
		
		
		return empDaoConn.provideEntityManager().find(employee.class, empid);
	}

	@Override
	public employee deleteEmployeeById(int empid) throws EmployeeException {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		employee emp = new employee();
		
		EntityManager em = empDaoConn.provideEntityManager();
		
		emp = em.find(employee.class, empid);
		
		if(emp != null) {
			
			em.getTransaction().begin();
			
			em.remove(emp);
			
			flag = true;
			
			em.getTransaction().commit();
			
		}
		
		em.close();
		
		if(flag) {
			
			return emp; 
			
			}else {

				throw new EmployeeException("did not find the employee");
			}
	}

	@Override
	public employee updateEmployee(employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		EntityManager em = empDaoConn.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		flag = true;
		
		em.getTransaction().commit();
		
		em.close();
		
		if(flag) {
		
			return emp;
		}else {
			
			throw new EmployeeException("employee not updated");
		}
	}

}
