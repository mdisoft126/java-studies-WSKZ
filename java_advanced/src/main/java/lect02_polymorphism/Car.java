package lect02_polymorphism;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Car extends WheeledVehicle{
	public Car(int serialNo, int wheelsNo, String model) {
		super(serialNo, wheelsNo);
		this.model = model;
	}

	private String model;

	@Override
	public String toString() {
		return "Car(model=" + model + ") " + super.toString();
	}
	
}
