package lastminute.salestaxes.bean;

import lastminute.salestaxes.calculator.Calculator;

public class Item {

	private String name;
	private ItemType itemType;
	private int quantity;
	private double price;
	private Import imported = Import.NOT_IMPORT;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return  Calculator.round(price, 2);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setImported(Import imported) {
		this.imported = imported;
	}

	public Import getImported() {
		return imported;
	}

	@Override
	public String toString() {
		StringBuffer builder = new StringBuffer();
		builder.append("Item [name=");
		builder.append(name);
		builder.append(", itemType=");
		builder.append(itemType);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
