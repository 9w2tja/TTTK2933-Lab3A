
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
}
