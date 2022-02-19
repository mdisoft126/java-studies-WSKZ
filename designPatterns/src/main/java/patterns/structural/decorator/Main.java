package patterns.structural.decorator;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		BigDecimal gross = BigDecimal.valueOf(1000);
		TaxCalculator taxCalculator = new TaxCalculatorImpl(gross);
		System.out.println("Net value: " + taxCalculator.getNetValue());
		
		TaxCalculator taxCalculator1 = new TaxCalculatorWithMultisport(taxCalculator);
		System.out.println("Net value: " + taxCalculator1.getNetValue());
	}

}
