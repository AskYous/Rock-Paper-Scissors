package RockPaperScissors;
import java.util.Random;

/**
 * Simulates the computer as a player of rock paper scissors game.
 */
public class CPUThrower extends Thrower {

    /**
     * Generates computer's next weapon.
     * @param ALG_TYPE Type of algorithm to generate cpu's next weapon. Used later. 
     * @return Cpu's next weapon.
     */
    public Weapon generateWeapon(int ALG_TYPE) {
        Weapon w;
        if (ALG_TYPE == 1) {
            Random rnd = new Random();
            int code = rnd.nextInt(4);
            while (code == 0) {
                code = rnd.nextInt(3);
            }
            if (code == 1) {
                super.setWeapon(Weapon.ROCK);
            } else if (code == 2) {
                super.setWeapon(Weapon.PAPER);
            } else if (code == 3) {
                super.setWeapon(Weapon.SCISSORS);
            }
            return super.getWeapon();

        } else {
            return null;
        }
    }
}