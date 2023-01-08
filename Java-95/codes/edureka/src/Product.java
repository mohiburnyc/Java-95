
public class Product {
	private long productId;
	private String productName;
	private float productPrice;

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public long getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	@Override
	public String toString() {
		return "Product [Product ID= " + productId + " | Product Name= " + productName + " | Product Price=" + productPrice
				+ "]";
	}
	
	
}
