package RockPaperScissors;


/**
 * This class sets the weapon for the user.
 * @version 1.0
 * @author Team Guilty Crown
 */
public class PlayerThrower extends Thrower {

    public PlayerThrower() {
    }

    /**
     * sets the weapon of the user.
     * @param input the weapon as a string
     */
    public Weapon generateWeapon(String input) {
        if (input.equals("r")) {
            super.setWeapon(Weapon.ROCK);
        }
        if (input.equals("p")) {
            super.setWeapon(Weapon.PAPER);
        }
        if (input.equals("s")) {
            super.setWeapon(Weapon.SCISSORS);
        }
        return super.getWeapon();
    }
}