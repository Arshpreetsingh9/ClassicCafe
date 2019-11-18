
public class Menu {
	private String itemName;
	private Double price;
	private int Mid;
	private int quantity;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	
	public Menu() {}
	
	public Menu(int Mid, String itemName, Double price, int quantity)
	{
		this.itemName=itemName;
		this.Mid= mid;
		this.price = price;
		
	}
	

}
