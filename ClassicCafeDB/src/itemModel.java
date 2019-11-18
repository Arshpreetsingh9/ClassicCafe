import java.util.ArrayList;
import java.util.List;

public class itemModel {

	private List<Menu> ITEMS;

	public itemModel() {

		this.ITEMS = new ArrayList<Menu>();
		this.MenuItems();

	}

	public List<Menu> getItems() 
	{
		return ITEMS;
	}
             // for storing items in menu of the cafe
	public void MenuItems() {
		String[] itemName = { "Dark roast", "French Vanilla", "Muffin" };
		Double[] Price = { 2.99, 2.49, 1.00 };
		Integer[] quantity = { 1, 2, 5 };
		
		for (int i = 0; i < itemName.length; i++)
		{
			this.ITEMS.add(new Menu(i + 1, itemName[i], Price[i], quantity[i]));
		}

	}

}
