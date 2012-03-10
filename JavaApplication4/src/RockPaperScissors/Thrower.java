package RockPaperScissors;


/**
 * Superclass of CPUThrower and PlayerThrower
 * @version 1.0
 * @author Team Guilty Crown
 */
public class Thrower {
    
    private Weapon weapon;
    
    String winner;
    
    public Weapon getWeapon(){
        return weapon;
    }
    
   /**
    * Set's the weapon for the cpu or the player.
    * @param weapon weapon generated by the subclasses
    */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    
}

