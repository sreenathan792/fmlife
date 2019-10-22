package design.pattern.strategy;

public class KnifeBehaviour implements WeaponBehaviour {

	@Override
	public void useWeapon() {
		System.out.println("Stab with knife");
	}

}
