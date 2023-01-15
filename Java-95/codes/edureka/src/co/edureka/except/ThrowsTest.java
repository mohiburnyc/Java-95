package co.edureka.except;

import java.sql.SQLException;

class UserService{
	public void findUserById(int uid) throws SQLException, InterruptedException {
		System.out.println("finding user with id: "+uid);
	}
}

public class ThrowsTest {

	public static void main(String[] args) throws Exception {
		UserService service = new UserService();
		try {
			service.findUserById(101);
		} catch (SQLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("please wait for 5 seconds...");
		Thread.sleep(5000);
		System.out.println("thanks!!!!");
	}

}
