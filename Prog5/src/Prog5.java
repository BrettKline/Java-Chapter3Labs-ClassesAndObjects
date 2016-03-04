//Dependency: RetailItem.java;
public class Prog5 {

	public static void main(String[] args) {
		RetailItem item1 = new RetailItem();
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();
		
		item1.setDescription("Jacket");
		item2.setDescription("Designer Jeans");
		item3.setDescription("Shirt");
		
		item1.setUnitsOnHand(12);
		item2.setUnitsOnHand(40);
		item3.setUnitsOnHand(20);
		
		item1.setPrice(59.95);
		item2.setPrice(34.95);
		item3.setPrice(24.95);

		System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println(item3.toString());
		

	}

}
