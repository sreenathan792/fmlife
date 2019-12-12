package design.pattern.factory;

public class Sedan implements Car {

	@Override
	public String startCar() {
		return "Started Sedan";
	}

	@Override
	public String stopCar() {
		return "Stopped Sedan";
	}

}
