
public class ShoppingCart {
	private Item item1;
	private Item item2;
	private Item item3;

	public String toString() {
		return "ShoppingCart[]";
	}

	public Item getItem1() {
		return item1;
	}

	public Item getItem2() {
		return item2;
	}

	public Item getItem3() {
		return item3;
	}

	public boolean addItem(Item item, int unit) {
		if (item1 == null) {
			item1 = new Item();
			//item1.setId(item.getId());
			//item1.setName(item.getName());
			//item1.setPrice(item.getPrice());
			item1 = item;
			item1.setUnit(unit);
		}

		else if (item2 == null) {
			item2 = new Item();
			item2.setId(item.getId());
			item2.setName(item.getName());
			item2.setPrice(item.getPrice());
			item2.setUnit(unit);
		}

		else if (item3 == null) {
			item3 = new Item();
			item3.setId(item.getId());
			item3.setName(item.getName());
			item3.setPrice(item.getPrice());
			item3.setUnit(unit);
		}

		else
			return false;

		return true;
	}

	public double getCartTotal() {
		double total = 0.0;

		if (item1 != null)
			total = total + item1.getItemTotal();

		if (item2 != null)
			total = total + item2.getItemTotal();

		if (item3 != null)
			total = total + item3.getItemTotal();

		return total;
	}
}
