package game_inventory;
import java.util.*;


public class RemoveItem {

	public static void RemoveItem(String[] args) {
		// TODO Auto-generated method stub
		boolean Menu = true;
		  int choice = 0;
		  int input = 0;
		  int index=0;
		  int total = 0;
		  Integer item;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> intList = AddItem.intList;
		//Prompts the user to enter item to remove
		System.out.println("Enter an item to remove:");
		//Scans input
		input = scan.nextInt();
		//item is declared as user input
		item = new Integer(input);
		//if statement that checks if the Array contains the item and removes it with the remove and contain keywords
		if (intList.contains(item))
		intList.remove(item);
		//if statements that check the user input and outputs text indicating removal of item
		if (item == 1){
		System.out.println("Sword removed");
		}
		if (item == 2){
		System.out.println("Bow removed");
		}
		if (item == 3){
		System.out.println("Helmet removed");
		}
		if (item == 4){
		System.out.println("Chestplate removed");
		}
		if (item == 5){
			System.out.println("Bandages removed");
			}
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

}}
