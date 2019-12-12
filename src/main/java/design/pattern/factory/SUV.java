package design.pattern.factory;

public class SUV implements Car {

	@Override
	public String startCar() {
		return "Started SUV";
	}

	@Override
	public String stopCar() {
		// TODO Auto-generated method stub
		return "Stopped SUV";
	}

}
