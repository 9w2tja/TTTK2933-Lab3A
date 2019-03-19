
public class Customer {
	private String name;
	private ShoppingCart cart;

	public Customer(String n) {
		name = n;
		cart = new ShoppingCart();
	}

	public String toString() {
		return "Customer[" + name + "]";
	}

	public String getName() {
		return name;
	}

	public ShoppingCart getShoppingCart() {
		return cart;
	}

}
