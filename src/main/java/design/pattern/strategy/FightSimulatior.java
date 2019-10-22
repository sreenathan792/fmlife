package design.pattern.strategy;

import java.io.InputStreamReader;
import java.util.Scanner;

public class FightSimulatior {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("Please enter choice 1.Normal 2.Viking 3.Eastern 4.Weak ");
		String in = scanner.next();
		WeaponBehaviour kingsWeapon = new SwordBehaviour();
		switch (in) {
			case "1" : {
				kingsWeapon = new SwordBehaviour();
				break;
			}
			case "2" : {
				kingsWeapon = new AxeBehaviour();
				break;
			}
			case "3" : {
				kingsWeapon = new BowAndArrowBehaviour();
				break;
			}
			default : kingsWeapon = new KnifeBehaviour();
		}
		scanner.close();
		
		Character king = new King();
		king.setBehaviour(kingsWeapon);
		king.fight();
	}

}
