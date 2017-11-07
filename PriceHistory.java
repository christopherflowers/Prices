package uwstout.cs144.labs.lab06;

import java.util.*;

/**
 * The purpose of this class is to store prices of an item over time and provide
 * access to the current price.
 * 
 * @author Flowersc
 * @version 2016-10-21
 */
public class PriceHistory {
	private String nameOfItem;
	private ArrayList<Double> prices;

	/**
	 * This constructor creates a new array list of an item.
	 * 
	 * @param itemName
	 *            this is the name of the item
	 */
	public PriceHistory(String itemName) {
		nameOfItem = itemName;
		prices = new ArrayList<Double>();

	}

	/**
	 * This getter gets the name of the item.
	 * 
	 * @return the name of the item
	 */
	public String getName() {
		return nameOfItem;
	}

	/**
	 * This getter gets the current price of the item.
	 * 
	 * @return current price
	 */
	public double getCurrentPrice() {
		if (prices.size() > 0) {
			int i = prices.size() - 1;
			return prices.get(i);
		}
		return 0;
	}

	/**
	 * This getter gets the number of prices in an array list.
	 * 
	 * @return number of prices
	 */
	public int getNumberOfPrices() {
		return prices.size();
	}

	/**
	 * This getter gets the price at a specific position.
	 * 
	 * @param position
	 *            this is the position you are looking at
	 * @return the price at a certain position
	 */
	public double getPrice(int position) {
		if (position >= 0 && position < prices.size()) {
			return prices.get(position);
		}

		return 0;
	}

	/**
	 * This method adds a new price if it is positive.
	 * 
	 * @param newPrice
	 *            this is the new price
	 */
	public void addPrice(double newPrice) {
		if (newPrice > 0) {
			prices.add(newPrice);
		}

	}

	/**
	 * This method adds prices from the scanner.
	 * 
	 * @param input
	 *            this is the prices from the scanner
	 */
	public void addPrices(Scanner input) {
		while (input.hasNextDouble()) {
			addPrice(input.nextDouble());
		}
	}

	/**
	 * This getter gets the maximum price in an array list.
	 * 
	 * @return the maximum price
	 */
	public double getMaximumPrice() {
		double max = 0;
		for (int i = 0; i < prices.size(); i++) {
			if (prices.get(i) > max) {
				max = prices.get(i);
			}
		}
		return max;
	}

	/**
	 * This getter gets the average price that is in the array list.
	 * 
	 * @return the average price in the list
	 */
	public double getAveragePrice() {
		if (prices.isEmpty()) {
			return 0;
		}
		double sum = 0;
		double avg;
		int i = 0;
		do {
			sum += prices.get(i);
			i++;
		} while (i < prices.size());

		avg = sum / prices.size();

		return avg;
	}
}
