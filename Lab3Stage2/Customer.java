
public class Customer {
	String name,Cust1,Cust2;
	ShoppingCart cart;
	
	public Customer(String n){
		name = n;
		ShoppingCart shop= new ShoppingCart();
		cart = shop;
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
}
