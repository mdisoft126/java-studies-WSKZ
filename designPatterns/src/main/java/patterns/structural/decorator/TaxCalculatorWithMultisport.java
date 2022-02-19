package patterns.structural.decorator;

import java.math.BigDecimal;

public class TaxCalculatorWithMultisport extends TaxCalculatorDecorator {

	private BigDecimal multisportPrice = new BigDecimal(10);
	
	public TaxCalculatorWithMultisport(TaxCalculator taxCalculator) {
		super(taxCalculator);
	}

	@Override
	public BigDecimal getNetValue() {
		return super.getNetValue().subtract(multisportPrice);
	}
}
