package RockPaperScissors;
/**
 * Holds the weapon that each player holds.
 */
public class Thrower {

    private Weapon weapon;

    /**
     * Returns the weapon
     * @return weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Sets the weapon for the cpu.
     * @param weapon for the cpu
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}