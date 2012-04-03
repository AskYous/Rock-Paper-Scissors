package RockPaperScissors;

import java.util.Random;

/**
 *
 * @author Yousef_2
 */
public class RandomCalculator extends CalculateWeapon {

    public RandomCalculator() {
    }

    /**
     * Randomly chooses a weapon
     * @return a weapon
     */
    @Override
    public Weapon calculateWeapon() {
        Weapon w = null;
        Random rnd = new Random();
            int code = rnd.nextInt(4);
            while (code == 0) {
                code = rnd.nextInt(3);
            }
            if (code == 1) {
                w = Weapon.ROCK;
            } else if (code == 2) {
                w = Weapon.PAPER;
            } else if (code == 3) {
                w = Weapon.SCISSORS;
            }
            return w;
    }
    
}