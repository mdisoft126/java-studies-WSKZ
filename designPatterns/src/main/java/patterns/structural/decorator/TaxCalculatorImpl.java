package patterns.structural.decorator;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {
	
	private BigDecimal gross;
	
	public TaxCalculatorImpl(BigDecimal gross) {
		this.gross = gross;
	}

	@Override
	public BigDecimal getNetValue() {
		return gross.multiply(BigDecimal.valueOf(0.83));
	}
}
