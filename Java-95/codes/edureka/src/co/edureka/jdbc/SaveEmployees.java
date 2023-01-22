package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection(); 
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp(empno, ename, sal) values(102, 'Anil', 2500), (103, 'Mark', 2550), (104, 'Sanjay',2750),"
				+ "(105, 'Sujith', 2750.50),(106, 'Sachin', 2500) ";
		try {
			int n = st.executeUpdate(sql);
			System.out.println("employees saved = " + n);
		}catch(Exception ex) {
			System.out.println("Error: "+ ex.toString());
		}
		
		st.close();
		con.close();

	}

}
