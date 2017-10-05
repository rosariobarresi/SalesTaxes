package lastminute.salestaxes.output;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import lastminute.salestaxes.bean.Item;

public class ReciptTest {

	@Test
	public void test() {
		Receipt receipt = new Receipt();
		Item item = new Item();
		receipt.addItem(item);
		assertEquals(item, receipt.getListItem().get(0));
		Item item2 = new Item();
		receipt.addItem(item2);
		assertEquals(item2, receipt.getListItem().get(1));
		receipt.setListItem(new ArrayList<>());
		assertNotNull(receipt.getListItem());
		assertEquals(0, receipt.getListItem().size());
		receipt.addToTaxes(10.2D);
		receipt.addToTaxes(17.82D);
		assertEquals(28.02D, receipt.getSalesTaxes(), 0);
		receipt.addToTotal(1.2D);
		receipt.addToTotal(17.82D);
		assertEquals(19.02D, receipt.getTotal(), 0);
		assertEquals(Boolean.TRUE, receipt.toString().length() > 0);
	}
}
