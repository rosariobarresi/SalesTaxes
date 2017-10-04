package lastminute.salestaxes.calculator;

import lastminute.salestaxes.bean.Item;

public class Calculator {

	public static double roundNearBound(double numero, int nCifreDecimali) {
		double d = Math.round(numero * Math.pow(10, nCifreDecimali)) / Math.pow(10, nCifreDecimali);
		String number = "" + d;
		if (number.substring(number.indexOf('.')).length() < 3) {
			return d;
		}
		char lastNumber = number.charAt(number.length() - 1);
		if (lastNumber == '0' || lastNumber == '1' || lastNumber == '2') {
			number = number.substring(0, number.length() - 1) + '0';
		} else if (lastNumber == '3' || lastNumber == '4' || lastNumber == '5' || lastNumber == '6'
				|| lastNumber == '7') {
			number = number.substring(0, number.length() - 1) + '5';
		} else if (lastNumber == '8') {
			return d + 0.02D;
		} else if (lastNumber == '9') {
			return d + 0.01D;
		}
		return Double.parseDouble(number);
	}

	public static double round(double numero, int nCifreDecimali) {
		return Math.round(numero * Math.pow(10, nCifreDecimali)) / Math.pow(10, nCifreDecimali);
	}

	public static double getPriceItemeWithTaxes(Item item) {
		double price = item.getPrice();
		double taxes = roundNearBound(getTaxesItem(item), 2);
		return round(price + taxes, 2);
	}

	public static double getTaxesItem(Item item) {
		return item.getPrice() * (item.getItemType().getSalesTax() + item.getImported().getSalesTax());
	}

}
