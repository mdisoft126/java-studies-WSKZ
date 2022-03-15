package lect05_inner_classes;

import lombok.Data;

@Data
public class Outer {
	private double outerValue;
	
	public Inner getInnerObject() {
		return new Inner();
	}
	
	@Data
	public class Inner {
		private double innerValue;
		private double innerResult = innerValue * outerValue;
	}
}
