package lect03_interfaces;

public interface BusinessLogic {
	double vat23 = 0.23;
	
	double calculateGrossBasedOnNetValue(double netValue);
	double calculateGrossBasedOnNetValue(int netValue);
	double calculateNetBasedOnGrossValue(double grossValue);
	double calculateNetBasedOnGrossValue(int grossValue);

}
