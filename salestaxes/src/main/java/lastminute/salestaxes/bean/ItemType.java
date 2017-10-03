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

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

}
