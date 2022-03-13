package lect02_polymorphism;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("--Vehicle type");
		Vehicle vehicle = new Vehicle(123);
		System.out.println("serial number: " + vehicle.getSerialNo());
		
		System.out.println("--Wheel type");
		WheeledVehicle wheeledVehicle = new WheeledVehicle(234,4);
		System.out.println("Serial no.: " + wheeledVehicle.getSerialNo());
		System.out.println("Serial no.: " + wheeledVehicle.getWheelsNo());
		
		System.out.println("--Car type");
		Car car = new Car(345, 4, "Audi A4");
		System.out.println("Serial no.: " + car.getSerialNo());
		System.out.println("Wheel no.: " + car.getWheelsNo());
		System.out.println("Car model: " + car.getModel());
		
		System.out.println(vehicle);
		System.out.println(wheeledVehicle);
		System.out.println(car);
		
		System.out.println("--Polymorphism");
		WheeledVehicle car1 = new Car(111, 4, "BMW");
		System.out.println(car1);
		System.out.println(car1.getClass());
		Vehicle car2 = new Car(222, 4, "Audi");
		System.out.println(car2);
		System.out.println(car2.getClass());
	}

}
