package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection(); 
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101, 'Sunil', 2500)";
		try {
			int n = st.executeUpdate(sql);
			System.out.println("employees saved = " + n);
		}catch(Exception ex) {
			System.err.println("Error: "+ ex.toString());
		}
		
		st.close();
		con.close();
	}

}
