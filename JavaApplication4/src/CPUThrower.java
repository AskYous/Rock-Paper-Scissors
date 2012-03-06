
import java.util.Random;

/**
 * Simulates the computer as a player of rock paper scissors game. 
 */
public class CPUThrower {

    public Weapon weapon;

    /**
     * Randomly generates a weapon
     */
    public CPUThrower() {
        Random rnd = new Random();
        int code = rnd.nextInt(4);
        String input = "";
        while (code == 0) {
            code = rnd.nextInt(3);
        }
        if (code == 1) {
            input = "r";
        }
        if (code == 2) {
            input = "p";
        }
        if (code == 3) {
            input = "s";
        }
        this.weapon = new Weapon(input);
    }

    /**
     * Set's the weapon for the cpu. Not used yet as the cpu's weapon is generated at random.
     * @param weapon for the cpu
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
