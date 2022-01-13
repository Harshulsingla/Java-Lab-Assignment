

class Part{
	// Java have 4 visiblity modifiers 
	// agr hum kuch nai likh rhe to vo default hai 
	private int id;//instance variable
	private String name;
	private double price;
	private static String brand;// class variable
	
	// setters, getters, logic method, constructors;
	// normally setters are mutators->mutators are those that mutate the value
	// normally getters are immutators;
	// jo data baar baar change nai hota uske liye normally hume constructor se value pass krni chaiye kyukiconstructor lifetime mei ek hi baar call hota hai, or setter unke liye use krna chaiye kyuki jinki value change hoti hai like price here;
	
	
	class Inventory{
		private static final int PARTS_SIZE=10;
		private String inventoryName;
		private Part[]parts;
		public inventory(string InventoryName) {
			this.inventoryName=inventoryName;
			parts==new Part[PARTS_SIZE];
		}
		private int counter=0;
		public void addPart(Part part) {
			counter++;
			if(counter==10) {
				
			SIR KE CODE MEI DEKHNA HAI 
			}
		}
	}
	
	public void setId(int tempId) {
		if(id=0) 
			id=tempId;
		else 
			System.out.println("its already set");
	}
	
	public int getId() {
		return id;
	}
	
//	public void foo() {
//		int i=0;//local to the method
//	}
	
}


public class ArrayofObjects {
		public static void main(String[] args) {
			Part part=new Part();// default constructor 
			System.out.println(part);// it will show garbage message ??
			System.out.println(part.id);
			System.out.println(part.name);
			System.out.println(part.price);
		}
}
