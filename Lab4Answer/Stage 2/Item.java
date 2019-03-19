
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

	public void setId(String i) {
		id = i;
	}

	public String getId() {
		return id;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double p) {
		price = p;
	}

	public double getPrice() {
		return price;
	}

	public void setUnit(int u) {
		unit = u;
	}

	public int getUnit() {
		return unit;
	}

}
