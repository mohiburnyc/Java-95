
public class StaticTest {
	static {
		System.out.println("static block - 1");
	}
	public static void main(String[] args) {
		System.out.println("in main method");
	}
	
	static {
		System.out.println("static block - 2");
	}
}
