
public class Tester3 {
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;

	private Customer cust1;
	private Customer cust2;

	public Tester3() {
		item1 = new Item("P001", "Pants", 39.99);
		item2 = new Item("P002", "Long skirt", 59.99);
		item3 = new Item("P003", "Shirt", 69.99);
		item4 = new Item("P004", "T-shirt", 19.99);

		cust1 = new Customer("Doremi");
		cust2 = new Customer("Fasola");
	}

	public void serveCustomer(Customer customer, Item item, int unit) {
		System.out.print("\n"+customer.getName()+" adds "+unit+" "+item.getName()+" into the shopping cart. ");

		if (! customer.addItemToCart(item, unit))
			System.out.print("Error - the shopping cart is full");
	}

	public void chargeCustomer(Customer customer) {
		System.out.print("\n\nCharging "+customer.getName()+" for:\n");

		ShoppingCart customerCart = customer.getShoppingCart();
		Item boughtItem1 = customerCart.getItem1();

		if (boughtItem1 != null) {
			System.out.println("\nItem ID: "+boughtItem1.getId());
			System.out.println("Item name: "+boughtItem1.getName());
			System.out.println("Price: RM "+boughtItem1.getPrice());
			System.out.println("Unit: "+boughtItem1.getUnit());
			System.out.println("Sub total: RM "+boughtItem1.getItemTotal());
		}

		Item boughtItem2 = customerCart.getItem2();

		if (boughtItem2 != null) {
			System.out.println("\nItem ID: "+boughtItem2.getId());
			System.out.println("Item name: "+boughtItem2.getName());
			System.out.println("Price: RM "+boughtItem2.getPrice());
			System.out.println("Unit: "+boughtItem2.getUnit());
			System.out.println("Sub total: RM "+boughtItem2.getItemTotal());
		}

		Item boughtItem3 = customerCart.getItem3();

		if (boughtItem3 != null) {
			System.out.println("\nItem ID: "+boughtItem3.getId());
			System.out.println("Item name: "+boughtItem3.getName());
			System.out.println("Price: RM "+boughtItem3.getPrice());
			System.out.println("Unit: "+boughtItem3.getUnit());
			System.out.println("Sub total: RM "+boughtItem3.getItemTotal());
		}

		System.out.println("\nTotal: RM "+customer.getTotalPurchase());
	}

	public static void main(String[] args) {
		Tester3 shop = new Tester3();

		shop.serveCustomer(shop.cust1, shop.item1, 2);
		shop.serveCustomer(shop.cust1, shop.item3, 2);
		shop.serveCustomer(shop.cust1, shop.item4, 3);
		shop.serveCustomer(shop.cust1, shop.item2, 1);

		shop.serveCustomer(shop.cust2, shop.item4, 2);
		shop.serveCustomer(shop.cust2, shop.item1, 1);

		shop.chargeCustomer(shop.cust1);
		shop.chargeCustomer(shop.cust2);
	}
}
