package game_inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewItems {

	public static void ViewItems(String[] args) {
		// TODO Auto-generated method stub
		 boolean Menu = true;
		  int choice = 0;
		  int input = 0;
		  int index=0;
		  int total = 0;
		  Integer item;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<CartItem> shoppingCart = new ArrayList<CartItem>();
		//checks to see if the intList array contains integers 1-5 and returns their respective items as Strings
		
		//utilizes contains keyword
		if (intList.contains(1)) {
			System.out.println("Sword");
		}
		else if (intList.contains(2)) {
			System.out.println("Bow");
		}
		else if (intList.contains(3)) {
			System.out.println("Helmet");
		}
		else if (intList.contains(4)) {
			System.out.println("Chestplate");
		}
		else if (intList.contains(5)) {
			System.out.println("Bandages");
		}
		else {
			System.out.println("No items in cart");
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
