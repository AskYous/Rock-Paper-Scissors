
import java.util.Random;

/**
 * Simulates the computer as a player of rock paper scissors game.
 */
public class CPUThrower extends Thrower{

    /**
     * Constructor
     */
    public CPUThrower() {
    }

    public Weapon generateWeapon(int ALG_TYPE){
        if(ALG_TYPE ==1){
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
            super.setWeapon(new Weapon(input));
            return super.getWeapon();
        }
        else
            return null;
    }
   
}

