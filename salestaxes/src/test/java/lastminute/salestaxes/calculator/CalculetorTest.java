package lastminute.salestaxes.calculator;

import org.junit.Test;

import lastminute.salestaxes.bean.Import;
import lastminute.salestaxes.bean.Item;
import lastminute.salestaxes.bean.ItemType;

import static org.junit.Assert.*;

public class CalculetorTest {

	@Test
	public void testRoundNearBound() {
		assertEquals(Calculator.roundNearBound(10, 2), 10D, 0);
		assertEquals(Calculator.roundNearBound(10.8061, 2), 10.8D, 0);
		assertEquals(Calculator.roundNearBound(10.8161, 2), 10.8D, 0);
		assertEquals(Calculator.roundNearBound(10.823, 2), 10.8D, 0);
		assertEquals(Calculator.roundNearBound(10.8349, 2), 10.85D, 0);
		assertEquals(Calculator.roundNearBound(10.8439, 2), 10.85D, 0);
		assertEquals(Calculator.roundNearBound(10.861, 2), 10.85D, 0);
		assertEquals(Calculator.roundNearBound(10.870, 2), 10.85D, 0);
		assertEquals(Calculator.roundNearBound(10.8811, 2), 10.9D, 0);
		assertEquals(Calculator.roundNearBound(10.8923, 2), 10.9D, 0);

	}

	@Test
	public void testGetGenericTaxes() {
		Item item = new Item();
		item.setPrice(12.34D);
		item.setItemType(ItemType.OTHER);
		item.setImported(Import.IMPORT);

		assertEquals(Calculator.roundNearBound(Calculator.getTaxesItem(item), 2), 1.85, 0);
	}

}
