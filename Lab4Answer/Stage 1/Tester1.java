
public class Tester1 {
	private Item item1;
	private Item item2;
	private Item item3;
	private Item item4;

	private Customer cust1;
	private Customer cust2;

	public Tester1() {
		item1 = new Item("P001", "Pants", 39.99);
		System.out.println("\nCreating Item object 1: "+item1);

		item2 = new Item("P002", "Long skirt", 59.99);
		System.out.println("\nCreating Item object 2: "+item2);

		item3 = new Item();
		System.out.println("\nCreating Item object 3: "+item3);

		item4 = new Item();
		System.out.println("\nCreating Item object 4: "+item4);

		cust1 = new Customer("Doremi");
		System.out.println("\nCreating Customer object 1: "+cust1);

		cust2 = new Customer("Fasola");
		System.out.println("\nCreating Customer object 2: "+cust2);
	}

	public static void main(String[] args) {
		Tester1 shop = new Tester1();
	}
}
