
/**
 * This class sets the weapon for the user.
 * @version 1.0
 */
public class PlayerThrower extends Thrower {

    public PlayerThrower() {
    }

    /**
     * sets the weapon of the user.
     * @param ALG_TYPE type of algorithm
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