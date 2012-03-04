
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
        int code = rnd.nextInt(3);
        String input = "";
        while(code == 0)
            code = rnd.nextInt(3);
        if(code == 1)
            input = "r";
        if(code == 2)
            input = "p";
        if(code == 3)
            input = "s";
        this.weapon = new Weapon(input);
    }

    //for later
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

