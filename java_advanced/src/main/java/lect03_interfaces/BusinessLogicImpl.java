package lect03_interfaces;

public class BusinessLogicImpl implements BusinessLogic{

	public double calculateGrossBasedOnNetValue(double netValue) {
		return netValue * (1 + BusinessLogic.vat23);
	}

	public double calculateGrossBasedOnNetValue(int netValue) {
		return netValue * (1 + BusinessLogic.vat23);
	}

	public double calculateNetBasedOnGrossValue(double grossValue) {
		return grossValue * (1 - BusinessLogic.vat23);
	}

	public double calculateNetBasedOnGrossValue(int grossValue) {
		return grossValue * (1 - BusinessLogic.vat23);
	}

	public static void main(String[] args) {
		BusinessLogic businessLogic = new BusinessLogicImpl();
		double value = 1000;
		System.out.printf("PLN %.2f net is PLN %.2f gross.\n", value, businessLogic.calculateGrossBasedOnNetValue(value));
		System.out.printf("PLN %.2f gross is PLN %.2f net.\n", value, businessLogic.calculateNetBasedOnGrossValue(value));
	}
	
}
