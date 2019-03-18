
public class Tester2 {
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;

	private Customer cust1;
	private Customer cust2;

	public Tester2() {
		item1 = new Item("P001", "Pants", 39.99);
		displayItemDetails(item1);

		item2 = new Item("P002", "Long skirt", 59.99);
		displayItemDetails(item2);

		item3 = new Item();
		displayItemDetails(item3);

		item4 = new Item();
		displayItemDetails(item4);

		cust1 = new Customer("Doremi");
		displayCustomerDetails(cust1);

		cust2 = new Customer("Fasola");
		displayCustomerDetails(cust2);
	}

	public void displayItemDetails(Item item) {
		System.out.println("\nCreating Item object: "+item+" >> id-"+item.getId()+" >> name-"+item.getName()+" >> price-"+item.getPrice()+" >> unit-"+item.getUnit());
	}

	public void displayCustomerDetails(Customer customer) {
		System.out.println("\nCreating Customer object: "+customer+" >> name-"+customer.getName()+" >> cart-"+customer.getShoppingCart());
		System.out.println("cart's item 1-"+customer.getShoppingCart().getItem1()+" >> cart's item 2-"+customer.getShoppingCart().getItem2()
				          +" >> cart's item 3-"+customer.getShoppingCart().getItem3());
	}

	public static void main(String[] args) {
		Tester2 shop = new Tester2();
	}
}
