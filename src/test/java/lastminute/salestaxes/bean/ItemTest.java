package lastminute.salestaxes.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testSetGetname() {
		Item item = new Item();
		item.setName("10");
		item.setImported(Import.IMPORT);
		item.setItemType(ItemType.BOOK);
		item.setPrice(10D);
		item.setQuantity(1);
		assertEquals("10", item.getName());
		assertEquals(Import.IMPORT, item.getImported());
		assertEquals(ItemType.BOOK, item.getItemType());
		assertEquals(10D, item.getPrice(), 0);
		assertEquals(1, item.getQuantity());
		assertEquals(Boolean.TRUE, item.toString().length() > 0);
	}

}
