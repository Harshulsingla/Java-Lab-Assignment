import java.util.LinkedList;

public class Inventory {
	private String inventoryName;
	
	private LinkedList<Product> products;
	
	public Inventory(String inventoryName) {
		this.inventoryName=inventoryName;
		this.products=new LinkedList <Product>();
	}
	
	
	
}
