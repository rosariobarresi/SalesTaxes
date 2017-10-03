package lastminute.salestaxes.calculator;

import lastminute.salestaxes.bean.Item;
import lastminute.salestaxes.input.Basket;
import lastminute.salestaxes.output.Receipt;

public class CashRegister implements ICashRegister {

	@Override
	public Receipt calculate(Basket basket) {
		Receipt recipt = new Receipt();
		basket.getListItem().forEach(item -> {
			recipt.addItem(item);
			recipt.addToTaxes(calulatePriceTaxes(item, Boolean.FALSE));
			recipt.addToTotal(calulatePriceTaxes(item, Boolean.TRUE));
		});
		return recipt;
	}

	private static double calulatePriceTaxes(Item item, boolean total) {
		double price = item.getPrice();
		if (total) {
			price += item.getPrice() * item.getItemType().getSalesTax();
		} else {
			price = item.getPrice() * item.getItemType().getSalesTax();
		}
		return arrotonda(price, 2);
	}

	public static double arrotonda(double numero, int nCifreDecimali) {
		return Math.round(numero * Math.pow(10, nCifreDecimali)) / Math.pow(10, nCifreDecimali);
	}

	// public static void main(String[] args) {
	// Item item = new Item();
	// item.setPrice(10.97222222D);
	// item.setItemType(ItemType.OTHER);
	// calulatePriceTaxes(item);
	// }

}
