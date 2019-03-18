
public class Item {
	private String id;
	private String name;
	private double price;
	private int unit;

	public Item() {
		
	}

	public Item (String idItem, String nameItem, double priceItem){
		id = idItem;
		name = nameItem;
		price = priceItem;
		unit= 0;
	}

	public String toString(){
		String str = "Item["+id+"]";
		return str;
	}
	
	public void setID (String idItem){
		id = idItem;
	}
	
	public String getId(){
		return id;
	}
	
	public void setName(String nameItem){
		name = nameItem;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPrice(double priceItem){
		price = priceItem;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setUnit(int unitItem){
		unit = unitItem;
	}
	
	public int getUnit(){
		return unit;
	}
	
	public double getItemTotal(){
		return price * unit;
	}
}
