package lastminute.salestaxes.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTypeTest {

	@Test
	public void test() {
		assertEquals(ItemType.BOOK.getNameType(), ItemType.getEnumFromName("book").getNameType());
		assertEquals(ItemType.FOOD.getNameType(), ItemType.getEnumFromName("food").getNameType());
		assertEquals(ItemType.MEDICAL.getNameType(), ItemType.getEnumFromName("medical").getNameType());
		assertEquals(ItemType.OTHER.getNameType(), ItemType.getEnumFromName("other").getNameType());
		assertEquals(ItemType.OTHER.getNameType(), ItemType.getEnumFromName("qqq").getNameType());

		assertEquals(ItemType.BOOK.getSalesTax(), ItemType.getSalesTaxFromName("book"),0);
		assertEquals(ItemType.FOOD.getSalesTax(), ItemType.getSalesTaxFromName("food"),0);
		assertEquals(ItemType.MEDICAL.getSalesTax(), ItemType.getSalesTaxFromName("medical"),0);
		assertEquals(ItemType.OTHER.getSalesTax(), ItemType.getSalesTaxFromName("other"),0);
		assertEquals(ItemType.OTHER.getSalesTax(), ItemType.getSalesTaxFromName("qqq"),0);

	}

}
