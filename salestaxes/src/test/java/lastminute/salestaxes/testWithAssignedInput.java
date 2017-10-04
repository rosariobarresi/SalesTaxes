package lastminute.salestaxes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lastminute.salestaxes.bean.Import;
import lastminute.salestaxes.bean.Item;
import lastminute.salestaxes.bean.ItemType;
import lastminute.salestaxes.calculator.CashRegister;
import lastminute.salestaxes.calculator.ICashRegister;
import lastminute.salestaxes.input.Basket;
import lastminute.salestaxes.output.Receipt;

public class testWithAssignedInput {

	@Test
	public void input1() {
		Item item1 = new Item();
		item1.setPrice(12.49D);
		item1.setName("book");
		item1.setQuantity(1);
		item1.setItemType(ItemType.BOOK);
		Item item2 = new Item();
		item2.setPrice(14.99D);
		item2.setName("music cd");
		item2.setQuantity(1);
		item2.setItemType(ItemType.OTHER);
		Item item3 = new Item();
		item3.setPrice(0.85D);
		item3.setName("chocolate bar");
		item3.setQuantity(1);
		item3.setItemType(ItemType.FOOD);
		Basket basket = new Basket();
		basket.addItem(item1);
		basket.addItem(item2);
		basket.addItem(item3);
		ICashRegister cashRegister = new CashRegister();
		Receipt receipt = cashRegister.calculate(basket);
		assertEquals(receipt.getListItem().get(0), item1);
		assertEquals(receipt.getListItem().get(1), item2);
		assertEquals(receipt.getListItem().get(2), item3);
		assertEquals(receipt.getTotal(), 29.83D, 0);
		assertEquals(receipt.getSalesTaxes(), 1.5D, 0);
		assertEquals(receipt.getListItem().get(0).getPrice(), 12.49D,0);
		assertEquals(receipt.getListItem().get(1).getPrice(), 16.49D,0);
		assertEquals(receipt.getListItem().get(2).getPrice(), 0.85D,0);
	}

	@Test
	public void input2() {
		Item item1 = new Item();
		item1.setPrice(10D);
		item1.setName("box of chocolates");
		item1.setQuantity(1);
		item1.setItemType(ItemType.FOOD);
		item1.setImported(Import.IMPORT);
		Item item2 = new Item();
		item2.setPrice(47.5D);
		item2.setName("bottle of perfume");
		item2.setQuantity(1);
		item2.setItemType(ItemType.OTHER);
		item2.setImported(Import.IMPORT);
		Basket basket = new Basket();
		basket.addItem(item1);
		basket.addItem(item2);
		ICashRegister cashRegister = new CashRegister();
		Receipt receipt = cashRegister.calculate(basket);
		assertEquals(receipt.getListItem().get(0), item1);
		assertEquals(receipt.getListItem().get(1), item2);
		assertEquals(receipt.getTotal(), 65.15D, 0);
		assertEquals(receipt.getSalesTaxes(), 7.65D, 0);
		assertEquals(receipt.getListItem().get(0).getPrice(), 10.50D,0);
		assertEquals(receipt.getListItem().get(1).getPrice(), 54.65D,0);
	}

	@Test
	public void input3() {
		Item item1 = new Item();
		item1.setPrice(27.99D);
		item1.setName("bottle of perfume");
		item1.setQuantity(1);
		item1.setItemType(ItemType.OTHER);
		item1.setImported(Import.IMPORT);
		Item item2 = new Item();
		item2.setPrice(18.99D);
		item2.setName("bottle of perfume");
		item2.setQuantity(1);
		item2.setItemType(ItemType.OTHER);
		Item item3 = new Item();
		item3.setPrice(9.75D);
		item3.setName("packet of headache pills:");
		item3.setQuantity(1);
		item3.setItemType(ItemType.MEDICAL);
		Item item4 = new Item();
		item4.setPrice(11.25D);
		item4.setName("box of chocolates");
		item4.setQuantity(1);
		item4.setItemType(ItemType.FOOD);
		item4.setImported(Import.IMPORT);
		Basket basket = new Basket();
		basket.addItem(item1);
		basket.addItem(item2);
		basket.addItem(item3);
		basket.addItem(item4);
		ICashRegister cashRegister = new CashRegister();
		Receipt receipt = cashRegister.calculate(basket);
		assertEquals(receipt.getListItem().get(0), item1);
		assertEquals(receipt.getListItem().get(1), item2);
		assertEquals(receipt.getListItem().get(2), item3);
		assertEquals(receipt.getListItem().get(3), item4);
		assertEquals(receipt.getTotal(), 74.63D, 0);
		assertEquals(receipt.getSalesTaxes(), 6.65D, 0);
		assertEquals(receipt.getListItem().get(0).getPrice(), 32.19D,0);
		assertEquals(receipt.getListItem().get(1).getPrice(), 20.89D,0);
		assertEquals(receipt.getListItem().get(2).getPrice(), 9.75D,0);
		assertEquals(receipt.getListItem().get(3).getPrice(), 11.80D,0);
	}

}
