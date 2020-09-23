import java.util.Arrays;

public class RestaurantApp {

	public static void main(String[] args) {
		// restaurant app
		int [] drinksPrice = {5, 8,12, 19, 7, 8};
		String[] availableDrinks = {"applejuice", "orangejuice", "vodka", "Beer", "Wine-red", "White-wine"};
		displayMenu(drinksPrice, availableDrinks);
		calculateAmount("Wine-red", 3, drinksPrice, availableDrinks);
	}
	
	public static void displayMenu(int[] price, String[] drinks) {
		int iterator;
		System.out.println("Displaying Drinks menu");
		System.out.println("Drinks         " + "Price($)");
		for (iterator =0; iterator < price.length; iterator++) {
			System.out.println(drinks[iterator] + "    \t" + price[iterator]);
		}
	}
	
	public static void calculateAmount(String itemOrdered, int Quantity, int[] price, String[] drinks) {
		int itemIndex;
		double totalPrice;
		itemIndex = Arrays.asList(drinks).indexOf(itemOrdered);
		totalPrice = price[itemIndex] * Quantity;
		System.out.println("Total price of " + drinks[itemIndex] + " for quantity " + Quantity + " is : $" + totalPrice);
	}

}
