//Dependency: Prog5.java
public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public String getDescription() {
		return description;
	}
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	public double getPrice() {
		return price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "RetailItem [description=" + description + ", unitsOnHand=" + unitsOnHand + ", price=" + price + "]";
	}
}
