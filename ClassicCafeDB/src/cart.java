import java.util.ArrayList;
import java.util.List;

public class cart {

	// ItemsInCart list is storing items added by customer in Cart.
	List<Menu>ItemsInCart= new ArrayList<Menu>();
	
	
	public void addByID(int Mid) {
		
	        Menu item = getProductByProductID(Mid);
	        addToCart(item);
	}

	    private Menu getProductByProductID(int Mid) {
	       Menu product = null;
	        List<Menu> Products = new itemModel().getItems();
	        // by using enhanced for loop , for each menu item in products
	        for (Menu prod: Products)
	        {
	            if (prod.getMid() == Mid) {
	                product = prod;
	                break;
	            }
	        }
	        return product;
	    }

	    private void addToCart(Menu product) {
	        ItemsInCart.add(product);
	    }
	    public void removeProductByPID(int Mid) {
	        Menu PRODUCT = getProductByProductID(Mid);
	        ItemsInCart.remove(PRODUCT);
	    }

	    

	}
	

