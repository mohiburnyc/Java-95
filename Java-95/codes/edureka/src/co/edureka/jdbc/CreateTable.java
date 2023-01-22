package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	
	public static void main(String[] args) throws Exception {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to MySQL db_edureka database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		//-- create an object for passing SQL queries
		Statement st = con.createStatement();
		
		//-- pass SQL query to create a DB table - emp (empno, ename, sal)
		String sql = "create table emp(empno int, ename varchar(30), sal float(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("Database Table Created!!");
		}catch(Exception ex) {
			System.out.println("ERROR---> " + ex.toString());
		}
		
		//-- close Statement & connection with Database
		st.close();
		con.close();
	}
}
