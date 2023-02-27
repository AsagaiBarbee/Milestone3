package game_inventory;
import java.util.*;



public class AddItem {
	
	public static ArrayList<Integer> intList = new ArrayList<Integer>();
	public static ArrayList<CartItem> shoppingCart = new ArrayList<CartItem>();
	public static void AddItem(String[] args) {
		  boolean Menu = true;
		  int choice = 0;
		  int input = 0;
		  int index=0;
		  int total = 0;
		  Integer item;
		Scanner scan = new Scanner(System.in);
//Display items and prices
	System.out.println("Choose an item:");
	System.out.println("1-Sword --- $20");
	System.out.println("2-Bow --- $30");
	System.out.println("3-Helmet --- $25");
	System.out.println("4-Chestplate --- $50");
	System.out.println("5-Bandages --- $15");
//Scan input 
	input = scan.nextInt();
	//stores input as variable item
	item = new Integer(input);
	//display text based on input showing item was added
	if (item == 1){
	System.out.println("Sword added to cart");
	}else if(item == 2){
		System.out.println("Bow added to cart");
	}else if(item == 3){
		System.out.println("Helmet added to cart");
	}else if(item == 4){
		System.out.println("Chestplate added to cart");
	}else if(item == 5){
		System.out.println("Bandages added to cart");


	}
	intList.add(item);
	
	}
	 public static ArrayList<Integer> getIntList() {
		return intList;
	}
	public static void setIntList(ArrayList<Integer> intList) {
		AddItem.intList = intList;
	}
	class CartItem {
		 //private variables initialize
		private String product;
		private int quantity;
		private double price;
	 
		//constructor
		public CartItem()
		{
			product = "";
			quantity = 0;
			price = 0.0;
		}
		public String getProduct()
		{
		return product;
		}
		public double getPrice()
		{
		return price;
		}
		public int getQuantity()
		{
		return quantity;
		}
	 
		//constructor with parameters
		public CartItem(String inProduct, int inQuant, double inPrice)
		{
			product = new String(inProduct);
			quantity = inQuant;
			price = inPrice;
		}
		//getter setter public methods for each instance data
		public boolean equals(CartItem item)
		{
			// code for the equals method
			//return true;
			boolean result = false;
			if (this.product.equalsIgnoreCase(item.getProduct()) && this.price == item.getPrice())
				result = true;
			else
				result = false;
	 
			return result;
		}
	 
		public String toString()
		{
			// code for toString method
			String result="";
	 
			return result;
		}
}
	public void display() {
		// TODO Auto-generated method stub
		System.out.print(intList);
	}}
