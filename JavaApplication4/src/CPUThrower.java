
import java.util.Random;

/**
 * Simulates the computer as a player of rock paper scissors game.
 */
public class CPUThrower extends Thrower{

    private Weapon weapon;

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
            this.weapon = new Weapon(input);
            return weapon;
        }
        else
            return null;
    }
    
    public Weapon getWeapon(){
        return weapon;
    }
           

    /**
    * Set's the weapon for the cpu. Not used yet as the cpu's weapon is generated at random.
    * @param weapon for the cpu
    */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

