
public class ShoppingCart {
	Item item1;
	Item item2;
	Item item3;
 
	 public String toString(){
		 String str = "ShoppingCart[]";
		 return str;
 	}
	 
	 public Item getItem1(){
		 return item1;
	 }
	 
	 public Item getItem2(){
		 return item2;
	 }
	 
	 public Item getItem3(){
		 return item3;
	 }
	 
	 public boolean addItem(Item i, int q){
		 //System.out.println(getItem1());
		 
		 if (item1 == null) {
			 Item i1 = new Item();
			 i1.setID(i.getId());
			 i1.setName(i.getName());
			 i1.setPrice(i.getPrice());
			 i1.setUnit(q);
			 item1 = i1;
			 return true;
		 } else if (item2 == null) {
			 Item i2 = new Item();
			 i2.setID(i.getId());
			 i2.setName(i.getName());
			 i2.setPrice(i.getPrice());
			 i2.setUnit(q);
			 item2 = i2;
			 return true;
		 } else if (item3 == null) {
			 Item i3 = new Item();
			 i3.setID(i.getId());
			 i3.setName(i.getName());
			 i3.setPrice(i.getPrice());
			 i3.setUnit(q);
			 item3 = i3;
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 public double getCartTotal(){
		 double total =0;
		 if (item1 != null) {
			 total = item1.getItemTotal();
		 } 
		 
		 if (item2 != null) {
			 total += item2.getItemTotal();
		 } 
		 
		 if (item3 !=null) {
			 total += item3.getItemTotal();
		 }
		 return total;
	 }
}
