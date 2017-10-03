package lastminute.salestaxes;

import lastminute.salestaxes.bean.Item;
import lastminute.salestaxes.bean.ItemType;
import lastminute.salestaxes.calculator.CashRegister;
import lastminute.salestaxes.calculator.ICashRegister;
import lastminute.salestaxes.input.Basket;

public class testWithAssignedInput {

	public static void main(String[] args) {
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
		System.out.println(cashRegister.calculate(basket));
	}

}
