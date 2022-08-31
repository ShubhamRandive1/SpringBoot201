package tableCreate;

import java.sql.Connection;
import java.sql.Statement;

import DAOConnect.DAOConn;

public class tableCreating {

		
		static String link = "jdbc:mysql://localhost:3306/db1";
		
		
		static String user = "root";
		
		
		static String password = "Shubhamcool1";
		
		
		
		public static void main(String[] args) {
			
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			}catch(ClassNotFoundException e) {
				
				
				e.printStackTrace();
				
			}
			
			
			try(Connection conn = DAOConn.provideConnection()){
				
				Statement stm = conn.createStatement();
				
				String sql ="Create Table emp"+"(empid int not null primary key,"+"name varchar(25) not null,"+"address varchar(25),"+"salary int not null)";
				
				
				stm.executeUpdate(sql);
				
				System.out.println("Table is created");
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}

	}

/*
 * mysql> desc emp;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| empid   | int         | NO   | PRI | NULL    |       |
| name    | varchar(25) | NO   |     | NULL    |       |
| address | varchar(25) | YES  |     | NULL    |       |
| salary  | int         | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.04 sec)
 * 
 * */
