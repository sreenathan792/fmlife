package design.pattern.strategy;

public class SwordBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("Slash ");
	}

}
