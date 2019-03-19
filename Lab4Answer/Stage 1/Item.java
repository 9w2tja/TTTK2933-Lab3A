
public class Item {
	private String id;
	private String name;
	private double price;
	private int unit;

	public Item() {}

	public Item(String i, String n, double p) {
		id = i;
		name = n;
		price = p;
		unit = 0;
	}

	public String toString() {
		return "Item[" + id + "]";
	}
}
