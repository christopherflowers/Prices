package uwstout.cs144.labs.lab06;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

/**
 * This class is used to test the class PriceHistory.
 * 
 * @author Flowersc
 * @version 2016-10-26
 */
public class PriceHistoryTest {

	/**
	 * This test tests every method in the PriceHistory class.
	 * 
	 */
	@Test
	public void testPriceHistory() {
		PriceHistory test1 = new PriceHistory("Lays");

		test1.addPrice(1.0);
		test1.addPrice(2.0);
		test1.addPrice(3.0);
		test1.addPrice(4.0);
		// current price
		// number of prices
		// price at a specific position
		// maximum price
		// average price
		assertEquals("Lays", test1.getName());
		assertEquals(4.0, test1.getCurrentPrice(), 0.001);
		assertEquals(4, test1.getNumberOfPrices());
		assertEquals(2.0, test1.getPrice(1), 0.001);
		assertEquals(4.0, test1.getMaximumPrice(), 0.001);
		assertEquals(2.5, test1.getAveragePrice(), 0.001);
		System.out.println("Name: " + test1.getName());
		System.out.println("Current Price: Expected 4.0 "
				+ "- Actual " + test1.getCurrentPrice());
		System.out.println("Number Prices: Expected 4.0 "
				+ "- Actual " + test1.getNumberOfPrices());
		System.out.println("Get Price at 1: Expected 2.0 "
				+ "- Actual " + test1.getPrice(1));
		System.out.println("Get Maximum Price: Expected 4.0 "
				+ "- Actual " + test1.getMaximumPrice());
		System.out.println("Get Average Price: Expected 2.5 "
				+ "- Actual " + test1.getAveragePrice());

		PriceHistory test2 = new PriceHistory("Doritos");

		test2.addPrice(1.0);
		test2.addPrice(1.5);
		test2.addPrice(2.0);
		test2.addPrice(2.5);
		test2.addPrice(3.0);
		test2.addPrice(3.5);
		test2.addPrice(4.0);
		test2.addPrice(4.5);
		test2.addPrice(5.0);
		// current price
		// number of prices
		// price at a specific position
		// maximum price
		// average price
		assertEquals("Doritos", test2.getName());
		assertEquals(5.0, test2.getCurrentPrice(), 0.001);
		assertEquals(9, test2.getNumberOfPrices());
		assertEquals(3.5, test2.getPrice(5), 0.001);
		assertEquals(5.0, test2.getMaximumPrice(), 0.001);
		assertEquals(3.0, test2.getAveragePrice(), 0.001);
		System.out.println("");
		System.out.println("Name: " + test2.getName());
		System.out.println("Current Price: Expected 5.0 "
				+ "- Actual " + test2.getCurrentPrice());
		System.out.println("Number Prices: Expected 9.0 "
				+ "- Actual " + test2.getNumberOfPrices());
		System.out.println("Get Price at 5: Expected 3.5 "
				+ "- Actual " + test2.getPrice(5));
		System.out.println("Get Maximum Price: Expected 5.0 "
				+ "- Actual " + test2.getMaximumPrice());
		System.out.println("Get Average Price: Expected 3.0 "
				+ "- Actual " + test2.getAveragePrice());

		PriceHistory test3 = new PriceHistory("Bananas");

		test3.addPrice(5.0);
		test3.addPrice(10.0);
		test3.addPrice(15.0);
		test3.addPrice(20.0);
		test3.addPrice(25.0);
		test3.addPrice(30.0);
		test3.addPrice(35.0);
		test3.addPrice(40.0);
		test3.addPrice(45.0);
		test3.addPrice(50.0);
		test3.addPrice(55.0);
		test3.addPrice(60.0);

		assertEquals("Bananas", test3.getName());
		assertEquals(60.0, test3.getCurrentPrice(), 0.001);
		assertEquals(12, test3.getNumberOfPrices());
		assertEquals(5.0, test3.getPrice(0), 0.001);
		assertEquals(60.0, test3.getMaximumPrice(), 0.001);
		assertEquals(32.5, test3.getAveragePrice(), 0.001);
		System.out.println("");
		System.out.println("Name: " + test3.getName());
		System.out.println("Current Price: Expected 60.0 "
				+ "- Actual " + test3.getCurrentPrice());
		System.out.println("Number Prices: Expected 12.0 "
				+ "- Actual " + test3.getNumberOfPrices());
		System.out.println("Get Price at 0: Expected 5.0 "
				+ "- Actual " + test3.getPrice(0));
		System.out.println("Get Maximum Price: Expected 60.0 "
				+ "- Actual " + test3.getMaximumPrice());
		System.out.println("Get Average Price: Expected 32.5 "
				+ "- Actual " + test3.getAveragePrice());
	}

}
