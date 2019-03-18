
public class Item {


	private String id;
	private String name;
	private double price;
	private int unit;

	public Item() {
		
	}


	public Item (String idItem, String nameItem, double priceItem, int unitItem){
	
	id = idItem;
	name = nameItem;
	price = priceItem;
	unit= 0;
	
	}


	public String toString(){
	
	String str = "Item["+id+"]";
	return str;
	

	}
}
