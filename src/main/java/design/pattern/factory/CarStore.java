package design.pattern.factory;

public class CarStore extends CarFactory {

	@Override
	public Car createCar(String type) {
		if ("SUV".equals(type)) {
			return new SUV();
		} else {
			return new Sedan();
		}
	}

}
