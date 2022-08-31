package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAOConnect.DAOConn;
import Employeeexception.EmployeeException;
import employee.empBean;

public class EmployeeDAO implements employeeDAOImpl{

	@Override
	public ArrayList<empBean> getAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		
		
		ArrayList<empBean> ee = new ArrayList<>();
		
		try(Connection conn = DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from emp");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int empid = rs.getInt("empid");
				
				String name = rs.getString("name");
				
				String address = rs.getString("address");
				
				int salary = rs.getInt("salary");
				
				empBean eee = new empBean(empid, name, address, salary);
				
				ee.add(eee);
				
				if(ee.size() == 0) {
					
					throw new EmployeeException("no employee data found");
				}
				
			}
			
			
		}catch(SQLException e) {
			
			throw new EmployeeException(e.getMessage());
			
		}
		
		
		return ee;
	}

	@Override
	public String getAddressOfEmployee(int empid) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String address =  "no data found";
		
		
		try(Connection conn = DAOConn.provideConnection()){
		
		PreparedStatement ps = conn.prepareStatement("select address from emp where empid=?");
		
		
		ps.setInt(1, empid);
		
		
	    ResultSet rs = ps.executeQuery();
	    
	    
	    if(rs.next()) {
	    	
	    	String addresss = rs.getString("address");
	    	
	    	int id = rs.getInt("empid");
	    	
	    	int Sal = rs.getInt("salary");
	    	
	    	empBean ee = new empBean(id, addresss, addresss, Sal);
	    	
	    	address = ee.getAddress();
	    	
	    }
				
		
		
		}catch(SQLException e) {
			
			throw new EmployeeException(e.getMessage());
		}
		
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empid, int bonus) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String bonuss = "no employee with details match";
		
		try(Connection conn = DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update emp set salary = salary+"+bonus+" where empid=?");
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				
				bonuss = "bonus added";
			}
			
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return bonuss;
	}

	@Override
	public String[] getNameAndAddress(int empid) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String[] str = new String[25];
		
		try(Connection conn = DAOConn.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from emp where empid=?");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				String name = rs.getString("name");
				
				int id = rs.getInt(empid);
				
				String addr = rs.getString("adderss");
				
				
				
				
			}else {
				
				throw new EmployeeException("not found employee");
			}
			
		}catch(SQLException e) {
			
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		return str;
		
		
	}

		

}
