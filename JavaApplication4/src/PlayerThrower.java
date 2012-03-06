
/**
 * This class sets the weapon for the user.
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class PlayerThrower extends Thrower {

    public Weapon weapon;

    /**
     * sets the weapon of the user.
     * @param input the weapon as a string
     */
    public PlayerThrower(String input) {
        this.weapon = new Weapon(input);
    }
}
