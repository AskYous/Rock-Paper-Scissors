package RockPaperScissors;


/**
 *
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class Thrower {
    
    private Weapon weapon;
    
    String winner;
    
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

