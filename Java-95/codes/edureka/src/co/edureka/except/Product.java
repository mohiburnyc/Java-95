package co.edureka.except;

public class Product {
	long productId;
	String productName;
	float productPrice;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(long productId, String productName, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return "Product [Product ID= " + productId + " | Product Name= " + productName + " | Product Price=" + productPrice
				+ "]";
	}
	
}
