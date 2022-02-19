package patterns.structural.decorator;

import java.math.BigDecimal;

public abstract class TaxCalculatorDecorator implements TaxCalculator {
	
	private TaxCalculator taxCalculator;

	public TaxCalculatorDecorator(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	@Override
	public BigDecimal getNetValue() {
		return taxCalculator.getNetValue();
	}
	
	
	
}
