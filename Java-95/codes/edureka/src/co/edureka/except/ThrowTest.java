package co.edureka.except;

public class ThrowTest {

	public static void main(String[] args) {
		try {
			//throw new ArithmeticException();
			throw new ArithmeticException("my custom message");
		}catch(Exception ex) {
			System.out.println("message = " + ex.getMessage());
			System.out.println(ex.toString());
		}

	}

}
