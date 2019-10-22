package design.pattern.strategy;

public class BowAndArrowBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("Fire Arrows");
	}

}
