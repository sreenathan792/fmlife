package design.pattern.strategy;

/**
 * Strategy Pattern - A Behavioral Design Pattern
 * The Strategy Pattern defines a family of algorithms (weapon behaviors here), 
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 * */

public class Character {

	WeaponBehaviour weaponBehaviour;
	public void setBehaviour(WeaponBehaviour wbh) {
		this.weaponBehaviour =wbh;
	}
	public void fight() {
		weaponBehaviour.useWeapon();
	}
	
}
