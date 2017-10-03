package lastminute.salestaxes.output;

import java.util.ArrayList;
import java.util.List;

import lastminute.salestaxes.bean.Item;

public class Receipt {

	private List<Item> listItem;
	private double salesTaxes;
	private double total;

	public void addToTotal(double calulatePriceTaxes) {
		salesTaxes += calulatePriceTaxes;
	}

	public void addItem(Item item) {
		if (listItem == null) {
			listItem = new ArrayList<Item>();
		}
		listItem.add(item);
	}

	public void addToTaxes(double calulatePriceTaxes) {
		total += calulatePriceTaxes;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public double getSalesTaxes() {
		return salesTaxes;
	}

	public double getTotal() {
		return total;
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
