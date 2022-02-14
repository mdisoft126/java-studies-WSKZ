package solid.interfaceSegregation;

public class Doctor implements DentalCare, EyeCare {

	@Override
	public void doDentalInspection() {
	}

	@Override
	public void doToothDrilling() {
	}

	@Override
	public void examineEyes() {
	}

}
