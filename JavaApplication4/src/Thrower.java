
/**
 *
 * @author Yousef_2, Carlos
 * @version 1.0
 */
public class Thrower {
    
    private Weapon weapon;
    
    String winner;
    
    /**
     * Similar to the Comparables compare method. Compares the weapons given
     * @param w1 weapon 1
     * @param w2weapon 2
     * @return Numerical value indicating win, loss, or tie.
     */
    public int compareWeapons(Weapon userW, Weapon cpuW){
        return userW.compare(cpuW);
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

