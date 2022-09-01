package DAOConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConn {

		
		private static String link = "jdbc:mysql://localhost:3306/db1";
		
		private static String user = "root";
		
		private static String password = "Shubhamcool1";

		public static Connection provideConnection() {
			// TODO Auto-generated method stub
			
			Connection conn = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				conn = DriverManager.getConnection(link,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
			

		}


	}


