package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(109, 'Arjun', 2500)");
		st.addBatch("insert into emp values(110, 'Abhi', 2575)");
		//st.addBatch("insert into emp values(109, 'Binu', 2600)");
		st.addBatch("insert into emp values(111, 'Binu', 2600)");
		st.addBatch("update emp set sal=2500 where empno > 108");
		
		try {
			int[] rowsAffected = st.executeBatch();
			for(int n : rowsAffected) {
				System.out.println("employees affected = " + n);
			}
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex.toString());
			con.rollback();
		}
		con.close();
	}
}