package lastminute.salestaxes.output;

import java.util.ArrayList;
import java.util.List;

import lastminute.salestaxes.bean.Item;
import lastminute.salestaxes.calculator.Calculator;

public class Receipt {

	private List<Item> listItem;
	private double salesTaxes;
	private double total;

	public void addToTotal(double calulatePriceTaxes) {
		total += calulatePriceTaxes;
	}

	public void addItem(Item item) {
		if (listItem == null) {
			listItem = new ArrayList<Item>();
		}
		listItem.add(item);
	}

	public void addToTaxes(double calulatePriceTaxes) {
		salesTaxes += calulatePriceTaxes;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public double getSalesTaxes() {
		return Calculator.round(salesTaxes, 2);
	}

	public double getTotal() {
		return Calculator.round(total, 2);
	}

	public void setListItem(List<Item> listItem) {
		this.listItem = listItem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Receipt [listItem=");
		builder.append(listItem);
		builder.append(", salesTaxes=");
		builder.append(salesTaxes);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}

}
