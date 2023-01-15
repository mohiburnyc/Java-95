package co.edureka.except;

public class Test {

	public static void main(String[] args) {
		Product product1 = new Product(101, "Mobile", 72500f);
		System.out.println("before calling method");
		System.out.println(product1);
		changeState(product1);
		System.out.println("after calling method");
		System.out.println(product1);
	}

	private static void changeState(Product product) {
		product=new Product();
		System.out.println("inside method");
		System.out.println(product);
		product.productName="Computer";
		System.out.println(product);
	}

}
