package lastminute.salestaxes.input;

import java.util.ArrayList;

import org.junit.Test;

import lastminute.salestaxes.bean.Item;

import static org.junit.Assert.*;

public class BasketTest {

	@Test
	public void test() {
		Basket basket = new Basket();
		Item item = new Item();
		basket.addItem(item);
		assertEquals(item, basket.getListItem().get(0));
		Item item2 = new Item();
		basket.addItem(item2);
		assertEquals(item2, basket.getListItem().get(1));
		basket.setListItem(new ArrayList<>());
		assertNotNull(basket.getListItem());
		assertEquals(0, basket.getListItem().size());
		assertEquals(Boolean.TRUE, basket.toString().length() > 0);
	}

}
