
public class Customer {
	String name;
	ShoppingCart cart;
	
	public Customer(String custName){
		name = custName;
		ShoppingCart sc= new ShoppingCart();
		cart = sc;
	}
	
	public String toString(){
		String str = "Customer["+ name +"]";
		return str;
	}
	
	public String getName(){
		return name;
	}
	
	public ShoppingCart getShoppingCart(){
		return cart;
	}
	
	public boolean addItemToCart(Item itemCust, int unitCust){
		ShoppingCart sc = cart;
		for (int x=0; x<3;) {
			return sc.addItem(itemCust,unitCust);
		}		
		return false;
	}
	
	public double getTotalPurchase(){
		ShoppingCart sc = cart;
		sc.getCartTotal();
		 return sc.getCartTotal();
	}
}
