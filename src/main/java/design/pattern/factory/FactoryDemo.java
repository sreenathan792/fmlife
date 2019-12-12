package design.pattern.factory;

/**
 * Factory Design Pattern - A Creational Design Pattern
 * Factory Method patterns defines an interface for creating an object,
 * but lets subclasses decide which class to instantiate. Factory Method
 * lets a class defer instantiation to subclasses
 * */

public class FactoryDemo {

	public static void main(String[] args) {

		CarFactory myStore = new CarStore();
		
		Car car1 = myStore.createCar("SUV");
		System.out.println(car1.startCar());
		System.out.println(car1.stopCar());
		
		Car car2 = myStore.createCar("Sedan");
		System.out.println(car2.startCar());
		System.out.println(car2.stopCar());
		
	}

}
