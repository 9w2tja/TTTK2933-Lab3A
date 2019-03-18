
public class Customer {

	
	String name,Cust1,Cust2;
	ShoppingCart cart;
	
	public Customer(String n){
		name = n;
		ShoppingCart shop= new ShoppingCart();
		shop = cart;
		}
	
	public String toString()
	{
		String str = "Customer["+ name +"]";
		return str;
	}
}
