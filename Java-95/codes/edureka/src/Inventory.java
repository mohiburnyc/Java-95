
public class Inventory {

	public static void main(String[] args) {
		Product product = new Product();
		//System.out.println(product.productId); //The field Product.productId is not visible
		
		product.setProductId(100123L);
		product.setProductName("Mobile");
		product.setProductPrice(72500f);
		
		System.out.println(product.getProductId() + " | " + product.getProductName() + " | " + product.getProductPrice());
		
		System.out.println("product is of type --> " + product.getClass().getName());
		System.out.println("hashCode of product --> " + product.hashCode());
		System.out.println("hashcode of product in hexa decimal form --> "+ Integer.toHexString(product.hashCode()));
		System.out.println();
		
		System.out.println(product); //toString()
	}

}
