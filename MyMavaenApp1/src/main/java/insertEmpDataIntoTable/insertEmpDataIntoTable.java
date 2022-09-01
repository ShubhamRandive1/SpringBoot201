package insertEmpDataIntoTable;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DAOConnect.DAOConn;
import employee.empBean;

public class insertEmpDataIntoTable {
	
	public boolean insertDataIntoTable(empBean ee) {
		
		
		boolean status = false;
		
		try {
			Connection conn = DAOConn.provideConnection();
			
			String sql = "insert into emp (empid,name,address,salary) valuse(?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, ee.getEmpid());
			
			ps.setString(2, ee.getName());
			
			ps.setString(3, ee.getAddress());
			
			ps.setInt(4, ee.getSalary());
			
			ps.executeUpdate();
			
			status = true;
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return status;
	
		
	}

}
