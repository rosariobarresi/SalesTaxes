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
			double priceWithTaxes = calulatePriceTaxes(item, Boolean.TRUE);
			recipt.addToTotal(priceWithTaxes);
			item.setPrice(priceWithTaxes);
		});
		return recipt;
	}

	private double calulatePriceTaxes(Item item, boolean total) {
		double price = item.getPrice();
		if (total) {
			price = Calculator.getPriceItemeWithTaxes(item);
		} else {
			price = Calculator.roundNearBound(Calculator.getTaxesItem(item), 2);
		}
		return price;
	}

}
