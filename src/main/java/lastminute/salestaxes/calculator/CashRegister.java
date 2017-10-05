package lastminute.salestaxes.calculator;

import lastminute.salestaxes.input.Basket;
import lastminute.salestaxes.output.Receipt;

public class CashRegister implements ICashRegister {

	public  Receipt calculate( Basket basket) {
		Receipt recipt = new Receipt();
		basket.getListItem().forEach(item -> {
			recipt.addItem(item);
			double taxes = Calculator.roundNearBound(Calculator.getTaxesItem(item), 2);
			recipt.addToTaxes(taxes);
			recipt.addToTotal(item.getPrice() + taxes);
			item.setPrice(item.getPrice() + taxes);
		});
		return recipt;
	}

}
