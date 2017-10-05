package lastminute.salestaxes.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImportTest {

	@Test
	public void test() {
		assertEquals(Import.IMPORT.getType(), Import.getImportEnumFromName("import").getType());
		assertEquals(Import.NOT_IMPORT.getType(), Import.getImportEnumFromName("not import").getType());
		assertEquals(Import.NOT_IMPORT.getType(), Import.getImportEnumFromName("asas").getType());

		assertEquals(Import.IMPORT.getSalesTax(), Import.getImportTaxFromName("import"),0);
		assertEquals(Import.NOT_IMPORT.getSalesTax(), Import.getImportTaxFromName("not import"),0);
		assertEquals(Import.NOT_IMPORT.getSalesTax(), Import.getImportTaxFromName("as"),0);
	}

}
