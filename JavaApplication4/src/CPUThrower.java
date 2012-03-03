
import java.util.Random;

/**
 *
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class CPUThrower {

    public Weapon weapon;

    /**
     * Randomly generates a weapon
     */
    public CPUThrower() {
        Random rnd = new Random();
        this.weapon = new Weapon();
        this.weapon.setWeapon(rnd.nextInt(3) + 1);
    }

    //for later
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
