package lastminute.salestaxes.bean;

public enum Import {

	IMPORT("import", 0.05D), NOT_IMPORT("not import", 0D);

	private String type;
	private double salesTax;

	private Import(String type, double salesTax) {
		this.type = type;
		this.salesTax = salesTax;
	}

	public String getType() {
		return type;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public static double getImportTaxFromName(String name) {
		for (Import importVar : Import.values()) {
			if (importVar.getType().equals(name)) {
				return importVar.getSalesTax();
			}
		}
		return Import.NOT_IMPORT.getSalesTax();
	}

	public static Import getImportEnumFromName(String name) {
		for (Import importVar : Import.values()) {
			if (importVar.getType().equals(name)) {
				return importVar;
			}
		}
		return Import.NOT_IMPORT;
	}

}
