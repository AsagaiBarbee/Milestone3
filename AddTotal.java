package game_inventory;
import java.util.*;

public class AddTotal {
	public static boolean Menu = true;
	  public static int choice = 0;
	 public static int input = 0;
	 public static int index=0;
	 public static int total = 0;
	public static  Integer item;
	public static void AddTotal(String[] args) {
		// TODO Auto-generated method stub
		//Initialize variables
		
		//Create scanner instance to get user input
		Scanner scan = new Scanner(System.in);
		//Create ArrayLists intList and shoppingCart to take store integer input and CartItems
		ArrayList<Integer> intList = AddItem.intList;
		ArrayList<CartItem> shoppingCart = new ArrayList<CartItem>();
		//Begin with total 0 
		total = 0;
		input = scan.nextInt();
		item = new Integer(input);
		intList.add(item);

		// if statements that check if the inventory contains the item by its integer and adds up the total 
		if (intList.contains(1)) {
			total = total + 20;
		}
		if (intList.contains(2)) {
			total = total + 30;
		}
		if (intList.contains(3)) {
			total = total + 25;
		}
		if (intList.contains(4)) {
			total = total + 50;
		}
		if (intList.contains(5)) {
			total = total + 15;
		}
		//Outputs total value and stops the program
		System.out.println("Your total is " + total);
		Menu = false;

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
