package lastminute.salestaxes.bean;

public class Item {

	private String name;
	private ItemType itemType;
	private int quantity;
	private double price;
	private boolean imported;

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
		return price;
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

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public boolean getImported() {
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
