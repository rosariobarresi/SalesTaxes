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
		if (lastNumber == '1' || lastNumber == '6') {
			return d - 0.01D;
		} else if (lastNumber == '2' || lastNumber == '7') {
			return d - 0.02D;
		} else if (lastNumber == '3' || lastNumber == '8') {
			return d + 0.02D;
		} else if (lastNumber == '4' || lastNumber == '9') {
			return d + 0.01D;
		}
		return Double.parseDouble(number);
	}

	public static double round(double numero, int nCifreDecimali) {
		return Math.round(numero * Math.pow(10, nCifreDecimali)) / Math.pow(10, nCifreDecimali);
	}

	

	public static double getTaxesItem(Item item) {
		return item.getPrice() * (item.getItemType().getSalesTax() + item.getImported().getSalesTax());
	}

}
