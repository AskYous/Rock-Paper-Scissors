
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
                super.setWeapon(Weapon.ROCK);
            }
            else if (code == 2) {
                super.setWeapon(Weapon.PAPER);
            }
            else if (code == 3) {
                super.setWeapon(Weapon.SCISSORS);
            }          
            return super.getWeapon();
            
        }
        else
            return null;
    }
   
}

