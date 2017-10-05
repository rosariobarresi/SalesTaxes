package lastminute.salestaxes.calculator;

import lastminute.salestaxes.input.Basket;
import lastminute.salestaxes.output.Receipt;

public interface ICashRegister {

	Receipt calculate(Basket basket);
}
