package Inheritance;

class Vehicle {
	String brand;
	int year;
	
	void startEngine() {
		System.out.println("Start engine");
	}
}

class Car extends Vehicle{
	String fuelType;
	
	void startEngine() {
		System.out.println("Car engine start");
		
	}
	void drive(){
		System.out.println("Car is driving");
	}
	
}

class Truck extends Vehicle{
	int loadCapacity;
	
	void startEngine() {
		System.out.println("Truck engine start");
		
	}
	void haul() {
		System.out.println("Truck in hauling");
	}
}


public class Challange2 {

	public static void main(String[] args) {
		Truck t1 = new Truck();
		t1.loadCapacity=200;
		t1.startEngine();
		t1.haul();
		
		System.out.println(t1.loadCapacity);

	}

}

