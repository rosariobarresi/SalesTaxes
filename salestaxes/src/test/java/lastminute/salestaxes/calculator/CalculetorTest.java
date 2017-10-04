package lastminute.salestaxes.calculator;

import org.junit.Test;

import lastminute.salestaxes.bean.Import;
import lastminute.salestaxes.bean.Item;
import lastminute.salestaxes.bean.ItemType;

import static org.junit.Assert.*;

public class CalculetorTest {

	@Test
	public void testRoundNearBound() {
		assertEquals(Calculator.roundNearBound(10.823, 2), 10.82, 0);
		assertEquals(Calculator.roundNearBound(10.8249, 2), 10.82, 0);
		assertEquals(Calculator.roundNearBound(10.8250, 2), 10.83, 0);
		assertEquals(Calculator.roundNearBound(10.8261, 2), 10.83, 0);
	}

	@Test
	public void testGetGenericTaxes() {
		Item item = new Item();
		item.setPrice(12.34D);
		item.setItemType(ItemType.OTHER);
		item.setImported(Import.IMPORT);
		assertEquals(Calculator.getPriceItemeWithTaxes(item), 12.957, 0);
		assertEquals(Calculator.roundNearBound(Calculator.getPriceItemeWithTaxes(item), 2), 12.96, 0);

		assertEquals(Calculator.getTaxesItem(item), 0.617, 0);
		assertEquals(Calculator.roundNearBound(Calculator.getTaxesItem(item), 2), 0.62, 0);
	}

}
