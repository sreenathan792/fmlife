package design.pattern.strategy;

public class AxeBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("Chop with Axe");
	}

}
