package game_inventory;
import java.util.*;
public class Game {

@SuppressWarnings("removal")
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
  boolean Menu = true;
  int choice = 0;
  int input = 0;
  int index=0;
  Integer item;
  int total = 0;
  ArrayList<Integer> intList = AddItem.intList;
  ArrayList<CartItem> shoppingCart = new ArrayList<CartItem>();

//Display Menu
while(Menu)
{
System.out.println("Welcome to your inventory! Choose an option:");
System.out.println("1 Add an item to your cart");
System.out.println("2 Remove an item from your cart");
System.out.println("3 View the items in your cart");
System.out.println("4 Exit and add up the total");
System.out.println("5 Empty your cart");
System.out.println("6 Exit");
System.out.println("Select a menu option");
//create choice variable that stores user input
choice = scan.nextInt();
//if statement that checks if user inputs 1-6 and else condition if not

if (choice <1 || choice >6)
{
System.out.println("Enter a value between 1 and 6:");
}
else
{
switch (choice)
//switch statement that checks "choice" and returns respective method
{
case 1:
	AddItem.AddItem(args);
	break;
case 2:
//remove from the list
	RemoveItem.RemoveItem(args);
break;
case 3:
	//utilizes contains keyword
			if (intList.contains(1)) {
				System.out.println("Sword");
			}
			 if (intList.contains(2)) {
				System.out.println("Bow");
			}
			 if (intList.contains(3)) {
				System.out.println("Helmet");
			}
			 if (intList.contains(4)) {
				System.out.println("Chestplate");
			}
			 if (intList.contains(5)) {
				System.out.println("Bandages");
			}
			if  (intList.isEmpty()){
				System.out.println("No items in cart");
			}
			
				
break;				
//view the items in your cart
case 4:
//Exit and add up the total	
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

break;
case 5:
	intList.clear();
//Empty the list
System.out.println("Cart cleared");
break;
case 6:
//exit
Menu = false;
System.out.println("Goodbye");
break;

}
}
}
}



}

//CartItem class
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