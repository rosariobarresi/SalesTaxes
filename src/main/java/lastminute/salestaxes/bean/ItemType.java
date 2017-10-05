package lastminute.salestaxes.bean;

public enum ItemType {

	BOOK("book", 0D), FOOD("food", 0D), MEDICAL("medical", 0D), OTHER("other", 0.10D);

	private String nameType;
	private double salesTax;

	private ItemType(String nameType, double salesTax) {
		this.nameType = nameType;
		this.salesTax = salesTax;
	}

	public String getNameType() {
		return nameType;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public static double getSalesTaxFromName(String name) {
		for (ItemType itemType : ItemType.values()) {
			if (itemType.getNameType().equals(name)) {
				return itemType.getSalesTax();
			}
		}
		return ItemType.OTHER.getSalesTax();
	}

	public static ItemType getEnumFromName(String name) {
		for (ItemType itemType : ItemType.values()) {
			if (itemType.getNameType().equals(name)) {
				return itemType;
			}
		}
		return ItemType.OTHER;
	}

}
