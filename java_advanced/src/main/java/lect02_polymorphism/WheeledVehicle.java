package lect02_polymorphism;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class WheeledVehicle extends Vehicle {
	public WheeledVehicle(int serialNo, int wheelsNo) {
		super(serialNo);
		this.wheelsNo = wheelsNo;
	}
	private int wheelsNo;
	@Override
	public String toString() {
		return "WheeledVehicle(wheelsNo=" + wheelsNo + ") " + super.toString();
	}
	
	
	
}
